/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo2;

import java.time.LocalDate;

/**
 *
 * @author tbn
 */
public class ExemploService {
    public Exemplo obterDados(String nome, LocalDate dataNascimento, int numero){
        Exemplo dado = new Exemplo();
        dado.setNome();
        dado.setDataNascimento(dataNascimento);
        dado.setNumero(numero);
        return dado;
    }
}           