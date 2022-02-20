package ru.picma.mtapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * Class {@code ComplimentController} handles requests from the Compliment API service
 *
 * @author  pic
 * @since   0.0.1
 */
@Controller
@RequestMapping("compliment")
public class ComplimentController {

    /**
     * GET method that communicates with another service and asks it for a map of compliments.
     * @param model class for add response on view
     * @return view compliments.html
     */
    @GetMapping("")
    public String getCompliments(Model model) {

        RestTemplate restTemplate = new RestTemplate();
        Map<Integer, String> map = restTemplate.getForObject("http://192.168.128.3:4321/compliment", HashMap.class);
        model.addAttribute("compliments", map);

        return "compliments";
    }

}
