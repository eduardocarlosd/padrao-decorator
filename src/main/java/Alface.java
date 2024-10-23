package org.example;

public class Alface extends HamburguerDecorator {

    public Alface(FazerHamburguer fazerhamburguer) {
        super(fazerhamburguer);
    }

    public float getPercentualPreco() {
        return 20.0f;
    }

    public String getNomeEstrutura() {
        return "Alface";
    }
}
