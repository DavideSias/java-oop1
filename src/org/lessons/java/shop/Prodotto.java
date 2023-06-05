package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    Random random = new Random();
    private int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private int iva;

    public Prodotto(String nome, String descrizione, double prezzo, int iva) {
        this.codice = random.nextInt(1000,9999);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // GETTERS
    public int getCodice(){
        return this.codice;
    }

    public String getNome(){
        return this.nome;
    }

    public String getDescrizione(){
        return this.descrizione;
    }

    public double getPrezzo(){
        return this.prezzo;
    }

    public int getIva(){
        return this.iva;
    }

    public double getPrezzoIva(){
        return this.prezzo + ((this.prezzo * this.iva) / 100);
    }

    public String getNomeEsteso(){
        return this.codice + "-" + this.nome;
    }

    // SETTERS


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

}
