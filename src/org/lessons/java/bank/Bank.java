package org.lessons.java.bank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Conto contoDavide = new Conto("Davide");
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserire il nome del proprietario del conto: ");
        String name = scan.nextLine();

        contoDavide.setProprietario(name);


        System.out.println(contoDavide.getProprietario() + "-" + contoDavide.getNumeroConto() + "-" + contoDavide.getSaldo());


    }
}
