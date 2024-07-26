package modelos.moedas;

public class Dolar extends Moeda {
        public Dolar(double valor) {
                super(valor);
        }

        @Override
        public double converterParaReal() {
                return valor * 5.00; // Supondo que 1 Dólar = 5 Reais
        }

        @Override
        public String getNome() {
                return "Dólar";
        }
}

