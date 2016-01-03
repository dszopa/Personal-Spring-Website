package me.dszopa.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by danny on 12/23/15.
 */
@Controller
public class AboutController {

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String view() {
        return "about";
    }
}
