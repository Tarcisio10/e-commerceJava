/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author tbn
 */
@Controller
public class ExemploController {

    
    @GetMapping
    public String exemplo1() {
        return "exemplo1";
    }
}
