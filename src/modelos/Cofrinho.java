package modelos;

import modelos.moedas.Moeda;

import java.util.ArrayList;
import java.util.Iterator;

public class Cofrinho {
    private ArrayList<Moeda> moedas;

    public Cofrinho() {
        this.moedas = new ArrayList<>();
    }

    public void adicionarMoeda(Moeda moeda) {
        moedas.add(moeda);
    }

    public void removerMoeda(String nome, double valor) {
        Iterator<Moeda> iterator = moedas.iterator();
        while (iterator.hasNext()) {
            Moeda m = iterator.next();
            if (m.getNome().equalsIgnoreCase(nome) && m.getValor() == valor) {
                iterator.remove();
                break;
            }
        }
    }

    public void listarMoedas() {
        for (Moeda m : moedas) {
            System.out.println(m.getNome() + ": " + m.getValor());
        }
    }

    public double calcularTotalEmReais() {
        double total = 0;
        for (Moeda m : moedas) {
            total += m.converterParaReal();
        }
        return total;
    }
}

