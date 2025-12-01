// OK
import java.util.Scanner;

public class questao5 {
    
}

public class TelaCarrinho {

    private Carrinho carrinho;
    private Scanner scanner;

    public TelaCarrinho(Carrinho carrinho) {

        this.carrinho = carrinho;
        this.scanner = new Scanner(System.in);

    }

    public void exibirMenu() {

        int opcao = -1;

        while (opcao != 0) {

            System.out.println("=============== MENU ElectricShope ===============");
            System.out.println("1. Inserir Mercadoria");
            System.out.println("2. Remover Mercadoria");
            System.out.println("3. Listar Mercadorias");
            System.out.println("==================================================");
            System.out.println("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    inserirMercadoria();
                    break;
                case 2:
                    removeMercadoria();
                    break;
                case 3:
                    carrinho.conteudo();
                    break;
                case 0:
                    System.out.println("Saindo do menu!");
                    break;
                default:System.out.println("Opção Invalida!");
                    
            }

        }

    }

    private void inserirMercadoria() {

        System.out.println("Qual produto voce esta comprando? ");
        System.out.println("1. Celular");
        System.out.println("2. Computador");
        System.out.println("Escolha uma opção: ");

        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Codgio do produto: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nome do produto: ");
        String nome = scanner.nextLine();
        System.out.println("Preco do produto: ");
        double preco = scanner.nextDouble();
        System.out.println("Desconto: ");
        double desconto = scanner.nextDouble();
        scanner.nextLine();

        Mercadoria novaMercadoria = null;

        if (tipo == 1) {
            novaMercadoria = new Celular(codigo, nome, preco, desconto);
        } else if (tipo == 2) {
            System.out.println("Digite a configuracao: ");
            String configuracao = scanner.nextLine();
            novaMercadoria = new Computador(codigo, nome, preco, desconto, configuracao);
        } else {
            System.out.println("Tipo invalido!");
            return;
        }

        carrinho.cadastrar(novaMercadoria);

    }

    private void removeMercadoria() {

        System.out.println("\n--- Remover Mercadoria: ---");
        System.out.println("Digite o codigo da mercadoria qu voce quer remover: ");

        int codigo = scanner.nextInt();
        scanner.nextLine();

        Mercadoria m = carrinho.procurar(codigo);

        if (m != null) {
            carrinho.remover(m);
        } else {
            System.out.println("Mercadoria NAO encontrada!");
        }

    }

    public static void main(String[] args) {

        Carrinho carrinhoNovo = new Carrinho(100, "Teste");

        TelaCarrinho tela = new TelaCarrinho(carrinhoNovo);
        tela.exibirMenu();

    }

}