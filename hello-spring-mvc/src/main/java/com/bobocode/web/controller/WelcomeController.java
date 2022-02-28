package com.bobocode.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Welcome controller that consists of one method that handles get request to "/welcome" and respond with a message.
 * <p>
 * todo: mark this class as Spring controller       x
 * todo: configure HTTP GET mapping "/welcome" for method {@link WelcomeController#welcome()}       x?
 * todo: tell Spring that {@link WelcomeController#welcome()} method provides response body         x
 */
@Controller
public class WelcomeController {
    @ResponseBody
    @GetMapping("/welcome")
    public String welcome() {
        return "/welcome";
    }

}
