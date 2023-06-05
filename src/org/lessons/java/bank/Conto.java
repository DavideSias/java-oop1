package org.lessons.java.bank;

import java.text.DecimalFormat;
import java.util.Random;

public class Conto {
    Random random = new Random();

    private int numeroConto;
    private String proprietario;
    private double saldo;

    public Conto(String proprietario){
        this.numeroConto = random.nextInt(1, 1000);
        this.proprietario = proprietario;
        this.saldo = 0;
    }

    public int getNumeroConto() {
        return numeroConto;
    }

    public double getSaldo(){
        return saldo;
    }

    public String getProprietario(){
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public void addMoney(double money){
        this.saldo += money;
    }

    public void subMoney(double money){
        if (money < this.saldo){
            this.saldo -= money;
        } else {
            System.out.println("Non disponi di tale somma");
        }
    }
}
