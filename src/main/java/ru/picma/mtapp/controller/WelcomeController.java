package ru.picma.mtapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author  pic
 * @since   0.0.1
 */
@Controller
public class WelcomeController {

    /**
     * GET method return index.html with greeting message.
     */
    @GetMapping
    public String mainPage() {
        return "index";
    }

}
