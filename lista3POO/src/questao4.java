// OK

import java.util.ArrayList;

public class questao4 {
    
}

public class Carrinho {

    private int codigo;
    private String nome;
    private ArrayList<Mercadoria> mercadorias;

    public Carrinho(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.mercadorias = new ArrayList<>();
    }

    public MercadoriaProcurar(int codigo) {

        for (Mercadoria m : mercadorias) {
            if (m.getCodigo() == codigo) {
                return m;
            }
        }

        return null;
    }

    public void cadastrar(Mercadoria m) {

        // public void cadastrar(Mercadoria m) -> insere a mercadoria no vetor,
        // dando uma mensagem de erro se o vetor estiver cheio ou a mercadoria
        // for nula.

        if (m == null) {

            System.out.println("Vetor esta cheio, mercadoria nao pode ser cadastrada!");
            return;

        }

        mercadorias.add(m);
        System.out.println("Mercadoria adicionada com sucesso!");

    }

    public void remover(Mercadoria m) {

        if (m == null) {

            System.out.println("Nao ha mercadoria a ser removida!");
        
        }

        boolean removido = mercadorias.remove(m);

        if (removido) {
            System.out.println("Mercadoria removida com sucesso!");
        } else {
            System.out.println("Mercadoria nao encontrada!");
        }

    }

    public void conteudo() {

        int qntdItens = 0;
        int valorTotal = 0;

        if (mercadorias.isEmpty()) {
            System.out.println("Nao ha mercadorias!");
        }

        for (Mercadoria m : mercadorias) {

            System.out.println("Codigo: "+m.getCodigo()+", nome: "+m.getNome()+", preco: "+m.getPreco());
            qntdItens++;
            valorTotal += m.getPreco();

        }

        System.out.println("Quantidade de itens: "+qntdItens);
        System.out.println("Valor total das mercadorias: "+valorTotal);

    }

}