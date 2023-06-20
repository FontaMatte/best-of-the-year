package org.lessons.bestoftheyear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller // Dice a Spring che e' un Controller
@RequestMapping("/") // Rotta alla quale rispondono i metodi del Controller
public class IndexController {

    @GetMapping()
    public String index(Model model) {
        model.addAttribute("name", "Matteo");
        return "index";   // Ritorna index.html della cartella template
    }

}
