package ru.picma.mtapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Class {@code AuthController} for authentication and authorization logic.
 *
 * @author  pic
 * @since   0.0.1
 */
@Controller
public class AuthController {

    /**
     * GET method return login.html with login form.
     */
    @GetMapping("/login")
    public String login() {
        return "login";
    }

}
