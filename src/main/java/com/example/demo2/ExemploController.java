/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo2;

import java.time.LocalDate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author tbn
 */
@Controller //clase controller criada
public class ExemploController {

    @GetMapping("/ex1")
    public String exemplo1() {
        return "exemplo1";
    }

    @GetMapping("/ex2")
    public String exemplo2(Model model) {
        model.addAttribute("nome", "Fulano");
        model.addAttribute("data nasci", LocalDate.parse("2000-01-01"));
        model.addAttribute("numero", 10);
        return "exemplo2";
    }
}
