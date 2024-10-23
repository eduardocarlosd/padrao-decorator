package org.example;

public class HamburguerPadrao implements FazerHamburguer {

    private float preco;

    // Construtor sem parâmetros
    public HamburguerPadrao() {
        this.preco = 5.0f; // Valor padrão para o hambúrguer
    }

    // Construtor com preço
    public HamburguerPadrao(float preco) {
        this.preco = preco;
    }

    // Implementação do método getPreco() da interface
    @Override
    public float getPreco() {
        return this.preco;
    }

    // Implementação do método getEstrutura() da interface
    @Override
    public String getEstrutura() {
        return "Hamburguer";
    }
}
