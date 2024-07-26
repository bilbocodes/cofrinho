import modelos.Cofrinho;
import modelos.moedas.Dolar;
import modelos.moedas.Euro;
import modelos.moedas.Real;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar moeda");
            System.out.println("2. Remover moeda");
            System.out.println("3. Listar moedas");
            System.out.println("4. Calcular total em Reais");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            if (opcao == 5) {
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Digite o tipo de moeda (Dolar/Euro/Real): ");
                    String tipo = scanner.next();
                    System.out.print("Digite o valor da moeda: ");
                    double valor = scanner.nextDouble();

                    switch (tipo.toLowerCase()) {
                        case "dolar":
                            cofrinho.adicionarMoeda(new Dolar(valor));
                            break;
                        case "euro":
                            cofrinho.adicionarMoeda(new Euro(valor));
                            break;
                        case "real":
                            cofrinho.adicionarMoeda(new Real(valor));
                            break;
                        default:
                            System.out.println("Moeda inválida!");
                    }
                    break;
                case 2:
                    System.out.print("Digite o tipo de moeda a remover (Dolar/Euro/Real): ");
                    tipo = scanner.next();
                    System.out.print("Digite o valor da moeda a remover: ");
                    valor = scanner.nextDouble();
                    cofrinho.removerMoeda(tipo, valor);
                    break;
                case 3:
                    cofrinho.listarMoedas();
                    break;
                case 4:
                    double total = cofrinho.calcularTotalEmReais();
                    System.out.println("Total em Reais: R$ " + total);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
}
