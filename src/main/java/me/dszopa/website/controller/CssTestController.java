package me.dszopa.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by danny on 12/25/15.
 */
@Controller
public class CssTestController {

    @RequestMapping(value ="/test", method = RequestMethod.GET)
    public String view() {
        return "test";
    }
}
