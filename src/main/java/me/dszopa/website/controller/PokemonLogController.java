package me.dszopa.website.controller;

import me.dszopa.website.controller.form.PokemonLogDeleteForm;
import me.dszopa.website.controller.form.PokemonLogAddForm;
import me.dszopa.website.entity.PokemonLog;
import me.dszopa.website.service.interfaces.PokemonLogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;
import java.util.List;

/**
 * Created by danny on 1/25/16.
 */
@Controller
@RequestMapping("/projects")
public class PokemonLogController {

    private static final Logger LOG = LoggerFactory.getLogger(PokemonLogController.class);

    @Autowired
    private PokemonLogService pokemonLogService;

    @RequestMapping(value = "pokemon_log", method = RequestMethod.GET)
    public String view(Model model) {
        model.addAttribute("addForm", new PokemonLogAddForm());
        model.addAttribute("deleteForm", new PokemonLogDeleteForm());
        model.addAttribute("allLogs", pokemonLogService.getAllLogs());
        return "pokemonLog";
    }

    @RequestMapping(value = "/pokemon_log/add", method = RequestMethod.POST, params = "add")
    public String addLog(@ModelAttribute("logForm") PokemonLogAddForm addForm) throws IOException {
        PokemonLog log = new PokemonLog();
        log.setTeamUsed(addForm.getTeamUsed());
        log.setMyStarters(addForm.getMyStarters());
        log.setMyOthers(addForm.getMyOthers());
        log.setOpponentStarters(addForm.getOpponentStarters());
        log.setOpponentOthers(addForm.getOpponentOthers());
        log.setResult(addForm.getResult());
        pokemonLogService.saveLog(log);
        return "redirect:/projects/pokemon_log";
    }

    @RequestMapping(value = "/pokemon_log/delete", method = RequestMethod.POST, params = "delete")
    public String deleteLogs(@ModelAttribute("deleteForm") PokemonLogDeleteForm deleteForm) {
        List<Long> formIds = deleteForm.getLogIds();
        if (formIds == null || formIds.size() == 0) {
            return "redirect:/projects/pokemon_log";
        }
        for (Long id : formIds) {
            pokemonLogService.deleteLog(id);
        }
        return "redirect:/projects/pokemon_log";
    }
}
