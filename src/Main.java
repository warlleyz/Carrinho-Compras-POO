import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Produto p1 = new Produto("Teclado", 1, 100.00);
        Produto p2 = new Produto("Mouse", 2, 50.00);
        Produto p3 = new Produto("Monitor", 3, 800.00);

        Fatura fatura = new Fatura();

        int opcao;

        do {

            System.out.println("\n===== LOJA =====");
            System.out.println("1 - Comprar");
            System.out.println("2 - Ver Fatura");
            System.out.println("3 - Excluir item");
            System.out.println("4 - Alterar item");
            System.out.println("5 - Finalizar");

            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:

                    System.out.println("\n===== PRODUTOS =====");

                    System.out.println(
                            p1.getCodigo() + " - "
                                    + p1.getNome()
                                    + " - R$ "
                                    + p1.getPreco());

                    System.out.println(
                            p2.getCodigo() + " - "
                                    + p2.getNome()
                                    + " - R$ "
                                    + p2.getPreco());

                    System.out.println(
                            p3.getCodigo() + " - "
                                    + p3.getNome()
                                    + " - R$ "
                                    + p3.getPreco());

                    System.out.println("0 - Voltar");

                    System.out.print("Código do produto: ");
                    int codigo = sc.nextInt();

                    if (codigo == 0) {
                        break;
                    }

                    Produto produtoEscolhido = null;

                    if (codigo == p1.getCodigo()) {
                        produtoEscolhido = p1;
                    } else if (codigo == p2.getCodigo()) {
                        produtoEscolhido = p2;
                    } else if (codigo == p3.getCodigo()) {
                        produtoEscolhido = p3;
                    }

                    if (produtoEscolhido == null) {
                        System.out.println("Produto não encontrado.");
                        break;
                    }

                    System.out.print("Quantidade: ");
                    int quantidade = sc.nextInt();

                    Item item = new Item(produtoEscolhido, quantidade);

                    fatura.adicionarItem(item);

                    System.out.println("Produto adicionado.");

                    break;
                case 2:
                    System.out.println("Ver Fatura");
                    break;
                case 3:
                    System.out.println("Excluir item");
                    break;
                case 4:
                    System.out.println("Alterar item");
                    break;
                case 5:
                    System.out.println("Finalizando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 5);
        sc.close();
    }
}