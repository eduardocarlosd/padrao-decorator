package org.example;

public class Bacon extends HamburguerDecorator {

    public Bacon(FazerHamburguer fazerhamburguer) {
        super(fazerhamburguer);
    }

    @Override
    public float getPercentualPreco() {
        return 10.0f; // Aumento de 10% no preço por adicionar bacon
    }

    @Override
    public String getNomeEstrutura() {
        return "Bacon";
    }
}
