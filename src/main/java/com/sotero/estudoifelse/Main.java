package com.sotero.estudoifelse;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(":::...ESTUDO IF & ELSE...:::");
        int idade;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        idade = scanner.nextInt();

        if (idade < 5) {
            if (idade == 0) {
                System.out.println("gugu dada");
            } else {
                System.out.println("Bebe");
                System.out.println("aki o bebe toma leite");
                System.out.println("anda de carrinho");
                System.out.println("nao pode ganhar lego pois pode engolir");
            }

        } else if ((idade >= 5) && (idade < 14)) {
            System.out.println("A faixa etária indica uma criança");
            System.out.println("ja pode ganhar um hotweels");
            System.out.println("ja ganha a sua primeira bola de futebol");
            System.out.println("ganha o seu primeiro playstation");
        } else if ((idade >= 15) && (idade <= 24)) {
            System.out.println("A faixa etária indica um Jovem");
            System.out.println("ja pratica jiu jitsu");
            System.out.println("faz aulas de violao");
        } else if (idade >= 25 && idade <= 64) {
            System.out.println("A faixa etária indica um Adulto");
            System.out.println("ja trabalha");
            System.out.println("casa");
            System.out.println("tem filhos");
        } else if (idade > 65 && idade < 900) {
            System.out.println("A faixa etária indica um Idoso");
            System.out.println("so enche o saco");
        } else {
            System.out.println("esse eh matusalem");
        }

        System.out.println(":::...FIM ESTUDO IF & ELSE...:::");
    }
}
