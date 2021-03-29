/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo2;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author tbn
 */
public class MainPadrao {

    private ExemploService service = new ExemploService();

    public String executar(String nome, LocalDate data, int numero) {
        Exemplo dado = service.obterDados(nome, data, numero);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nome: ");
        String nome = input.nextLine();
        System.out.println("yyyy-mm-dd: ");
        String dataStr = input.nextLine();
        System.out.println("1 - 99: ");
        String numeroStr = input.nextLine();

    }
}
