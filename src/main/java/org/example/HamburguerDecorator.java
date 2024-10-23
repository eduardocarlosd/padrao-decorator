package org.example;

public abstract class HamburguerDecorator implements FazerHamburguer {

    private FazerHamburguer fazerhamburguer;
    public String estrutura;

    // Construtor
    public HamburguerDecorator(FazerHamburguer fazerhamburguer) {
        this.fazerhamburguer = fazerhamburguer;
    }

    // Getter para fazerhamburguer
    public FazerHamburguer getFazerHamburguer() {
        return fazerhamburguer;
    }

    // Método abstrato para retornar o percentual do preço
    public abstract float getPercentualPreco();

    // Implementação do método para obter o preço
    @Override
    public float getPreco() {
        // Calcula o preço baseado no percentual de preço
        return this.fazerhamburguer.getPreco() * (1 + this.getPercentualPreco() / 100);
    }

    // Método abstrato para obter o nome da estrutura
    public abstract String getNomeEstrutura();

    // Implementação do método para obter a estrutura
    @Override
    public String getEstrutura() {
        // Concatena a estrutura atual com a nova
        return this.fazerhamburguer.getEstrutura() + "/" + this.getNomeEstrutura();
    }
}
