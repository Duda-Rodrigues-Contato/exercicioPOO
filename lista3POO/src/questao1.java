public class questao1 {

    public static void main(String[] args) {
        
    }

}


public abstract class Mercadoria {

    private int codigo;
    private String nome;
    private double preco; 
    private double desconto;

    public Mercadoria(int codigo, String nome, double preco, double desconto) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public abstract double preco_a_vista();

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

}
