package modelos.moedas;

/*Classe abstrata que representa uma moeda, contendo um valor e métodos para conversão para real e obtenção do nome da moeda. As classes que herdam de Moeda devem implementar os métodos de conversão e nome específico da moeda*/

public abstract class Moeda {
    protected double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public abstract double converterParaReal();

    public abstract String getNome();
}
