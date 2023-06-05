package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto prodotto = new Prodotto("monitor", "Monitor Samsung", 100, 20);

        prodotto.setNome("smartphone");
        prodotto.setDescrizione("smartphone Apple");
        prodotto.setPrezzo(150);
        prodotto.setIva(22);

        System.out.println("codice: " + prodotto.getCodice() + "\n" + "nome: " + prodotto.getNome() + "\n" + "descrizione: " + prodotto.getDescrizione() + "\n" + "prezzo: " + prodotto.getPrezzo() + "\n" + "iva: " + prodotto.getIva());
        System.out.println(prodotto.getPrezzoIva());
        System.out.println(prodotto.getNomeEsteso());

    }
}
