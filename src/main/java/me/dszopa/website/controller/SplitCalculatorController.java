package me.dszopa.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by danny on 12/26/15.
 */
@Controller
public class SplitCalculatorController {

    @RequestMapping(value = "/split_calculator", method = RequestMethod.GET)
    public String view() {
        return "splitCalculator";
    }
}
