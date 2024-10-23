package org.example;

public class Tomate extends HamburguerDecorator {

    public Tomate(FazerHamburguer fazerhamburguer) {
        super(fazerhamburguer);
    }

    @Override
    public float getPercentualPreco() {
        return 5.0f; // Aumento de 5% no preço por adicionar tomate
    }

    @Override
    public String getNomeEstrutura() {
        return "Tomate";
    }
}
