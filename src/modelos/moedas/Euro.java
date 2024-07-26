package modelos.moedas;

public class Euro extends Moeda {
    public Euro(double valor) {
        super(valor);
    }

    @Override
    public double converterParaReal() {
        return valor * 6.07;
    }

    @Override
    public String getNome() {
        return "Euro";
    }
}
