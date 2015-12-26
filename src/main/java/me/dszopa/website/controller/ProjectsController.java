package me.dszopa.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by danny on 12/26/15.
 */
@Controller
public class ProjectsController {

    @RequestMapping(value = "/projects", method = RequestMethod.GET)
    public String view() {
        return "projects";
    }
}
