package org.lessons.java.bank;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        Conto contoDavide = new Conto("Davide");

        Scanner scan = new Scanner(System.in);

        DecimalFormat decimalPrice = new DecimalFormat("#0.00€");

        System.out.print("Inserire il nome del proprietario del conto: ");
        String name = scan.nextLine();
        contoDavide.setProprietario(name);

        boolean exit = false;

        // System.out.println(contoDavide.getProprietario() + "-" + contoDavide.getNumeroConto() + "-" + contoDavide.getSaldo());

        while(!exit){
            System.out.print("Che operazione vuoi eseguire sul conto? (digitare \"versare\", \"prelevare\" o \"uscire\"): ");
            String operation = scan.nextLine().toLowerCase();
            double totSaldo = contoDavide.getSaldo();
            switch (operation) {
                case "versare" -> {
                    System.out.println("Indicare importo da versare: ");
                    double importo = scan.nextDouble();
                    contoDavide.addMoney(importo);
                    System.out.println("Saldo conto: " + decimalPrice.format(contoDavide.getSaldo()));
                }
                case "prelevare" -> {
                    System.out.println("Indicare importo da prelevare: ");
                    double importo = scan.nextDouble();
                    if (importo > totSaldo){
                        contoDavide.subMoney(importo);
                        System.out.println("Saldo conto: " + decimalPrice.format(contoDavide.getSaldo()));
                    } else {
                        System.out.println("Non disponi di tale somma");
                    }
                }
                case "uscire" -> {
                    System.out.println("Saldo conto: " + decimalPrice.format(contoDavide.getSaldo()));
                    exit = true;
                }
            }
        }


    }
}
