package me.dszopa.website.controller;

import me.dszopa.website.controller.form.PokemonTeamAddForm;
import me.dszopa.website.entity.PokemonTeam;
import me.dszopa.website.service.interfaces.PokemonTeamService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by dszopa on 1/12/16.
 */
@RequestMapping("/projects")
public class PokemonTeamsController {

    private PokemonTeamService pokemonTeamService;

    public PokemonTeamsController(PokemonTeamService pokemonTeamService) {
        this.pokemonTeamService = pokemonTeamService;
    }

    @RequestMapping(value = "/pokemon_teams", method = RequestMethod.GET)
    public String view(Model model) {
        model.addAttribute("teams", pokemonTeamService.getAllTeams());
        model.addAttribute("addForm", new PokemonTeamAddForm());
        return "pokemonTeams";
    }

    @RequestMapping(value = "/pokemon_teams/add", method = RequestMethod.POST)
    public String addTeam(@ModelAttribute("addForm") PokemonTeamAddForm addForm) {
        PokemonTeam team = new PokemonTeam();
        team.setTeamName(addForm.getTeamName());
        team.setTeamData(addForm.getTeamData());
        pokemonTeamService.saveTeam(team);
        return "redirect:/projects/pokemon_teams";
    }

    @RequestMapping(value = "pokemon_teams/delete/{teamId}", method = RequestMethod.POST)
    public String deleteTeam(@PathVariable Long teamId) {
        pokemonTeamService.deleteTeam(teamId);
        return "redirect:/projects/pokemon_teams";
    }
}
