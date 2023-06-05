package org.lessons.java.shop;

import java.text.DecimalFormat;
import java.util.Random;

public class Prodotto {
    Random random = new Random();
    DecimalFormat formatCode = new DecimalFormat("00000000");
    private int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private int iva;

    public Prodotto(String nome, String descrizione, double prezzo, int iva) {
        this.codice = random.nextInt(1,99999999);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // GETTERS
    public int getCodice(){
        return codice;
    }

    public String getNome(){
        return nome;
    }

    public String getDescrizione(){
        return descrizione;
    }

    public double getPrezzo(){
        return prezzo;
    }

    public int getIva(){
        return iva;
    }

    public double getPrezzoIva(){
        return prezzo + ((prezzo * iva) / 100);
    }

    public String getNomeEsteso(){
        return codice + "-" + nome;
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
