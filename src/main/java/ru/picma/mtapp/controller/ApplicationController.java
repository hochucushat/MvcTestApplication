package ru.picma.mtapp.controller;

import lombok.SneakyThrows;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class ApplicationController {

    @GetMapping("")
    public String mainPage() {
        return "index";
    }

    @SneakyThrows
    @GetMapping("/compliment")
    public String getRandomCompliment(Model model) {

        RestTemplate restTemplate = new RestTemplate();
        List<String> list = restTemplate.getForObject("http://192.168.128.3:4321/compliment", ArrayList.class);
        Random random = new Random();
        String someCompliment = list.get(random.nextInt(list.size()));

        model.addAttribute("compliment", someCompliment);

        return "compliment";
    }

}
