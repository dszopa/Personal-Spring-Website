package me.dszopa.website.controller;

import me.dszopa.website.controller.form.PokemonLogDeleteForm;
import me.dszopa.website.controller.form.PokemonLogAddForm;
import me.dszopa.website.entity.PokemonLog;
import me.dszopa.website.service.interfaces.PokemonLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by danny on 1/25/16.
 */
@Controller
@RequestMapping("/projects")
public class PokemonLogController {

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
    public String addLog(@ModelAttribute("logForm") PokemonLogAddForm addForm) {
        PokemonLog log = new PokemonLog();
        if (!(addForm.getUrl().equals(""))) {
            // TODO dszopa 2/1/16 - Parse the url into a PokemonLog
            System.out.println(addForm.getUrl().equals(""));
            log.setTeamUsed("lol");
            log.setMyStarters("lol");
            log.setMyOthers("lol");
            log.setOpponentStarters("lol");
            log.setOpponentOthers("lol");
            log.setResult("lol");
        } else {
            System.out.println(addForm.getUrl());
            log.setTeamUsed(addForm.getTeamUsed());
            log.setMyStarters(addForm.getMyStarters());
            log.setMyOthers(addForm.getMyOthers());
            log.setOpponentStarters(addForm.getOpponentStarters());
            log.setOpponentOthers(addForm.getOpponentOthers());
            log.setResult(addForm.getResult());
        }
        pokemonLogService.saveLog(log);
        return "redirect:/projects/pokemon_log";
    }

    @RequestMapping(value = "/pokemon_log/delete", method = RequestMethod.POST, params = "delete")
    public String deleteLogs(@ModelAttribute("deleteForm") PokemonLogDeleteForm deleteForm) {
        List<Long> formIds = deleteForm.getLogIds();
        System.out.println("formIds: " + formIds.toString());
        if (formIds == null || formIds.size() == 0) {
            System.out.println("formIds was null");
            return "redirect:/projects/pokemon_log";
        }
        for (Long id : formIds) {
            pokemonLogService.deleteLog(id);
        }
        return "redirect:/projects/pokemon_log";
    }
}
