package me.dszopa.website.controller;

import me.dszopa.website.controller.form.IdeaBoardAddForm;
import me.dszopa.website.entity.ProgrammingIdea;
import me.dszopa.website.service.interfaces.ProgrammingIdeaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by danny on 12/28/15.
 */
@Controller
@RequestMapping("/projects")
public class IdeaBoardController {

    @Autowired
    private ProgrammingIdeaService ideaService;

    @RequestMapping(value = "/idea_board", method = RequestMethod.GET)
    public String view(Model model) {
        model.addAttribute("ideas", ideaService.getAllIdeas());
        model.addAttribute("addForm", new IdeaBoardAddForm());
        return "ideaBoard";
    }

    @RequestMapping(value = "/idea_board/add", method = RequestMethod.POST)
    public String addIdea(@ModelAttribute("addForm") IdeaBoardAddForm addForm) {
        ProgrammingIdea idea = new ProgrammingIdea();
        idea.setIdea(addForm.getIdea());
        ideaService.saveIdea(idea);
        return "redirect:/projects/idea_board";
    }

    @RequestMapping(value = "/idea_board/delete/{ideaId}", method = RequestMethod.POST)
    public String deleteIdea(@PathVariable String ideaId) {
        ideaService.deleteIdea(Long.valueOf(ideaId));
        return "redirect:/projects/idea_board";
    }
}
