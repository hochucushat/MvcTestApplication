package ru.picma.mtapp.controller;

import lombok.SneakyThrows;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
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
        List<String> list = restTemplate.getForObject("http://localhost:4321/compliment", ArrayList.class);
        Random random = new Random();
        String compliment = list.get(random.nextInt(list.size()));
        System.out.println(compliment);

        model.addAttribute("compliment", compliment);

        return "compliment";
    }

}
