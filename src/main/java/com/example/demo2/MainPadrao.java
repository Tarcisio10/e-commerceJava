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

    public void executar() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nome: ");
        String nome = input.nextLine();
        System.out.println("yyyy-mm-dd: ");
        String dataStr = input.nextLine();
        System.out.println("1 - 99: ");
        String numeroStr = input.nextLine();

        Exemplo dado = service.obterDados(nome, LocalDate.parse(dataStr), Integer.parseInt(numeroStr));

        System.out.println("Dados digitados: Nome: " + dado.getNome() + " Da ta: " + dado.getDataNascimento() + " Numero: " + dado.getNumero());
    }

    public static void main(String[] args) {
        MainPadrao main = new MainPadrao();
        main.executar();

    }
}
