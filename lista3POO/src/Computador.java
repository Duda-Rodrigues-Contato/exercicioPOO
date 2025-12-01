// OK

public class Computador extends Mercadoria {

    private String configuracao;
    private static final double DESCONTO_FIXO = 0.10;

    public Computador (int codigo, String nome, double preco, double desconto, String configuracao) {

        super(codigo, nome, preco, desconto);
        this.configuracao = configuracao;

    }

    public String getConfiguracao() {
        return configuracao;
    }

    @Override
    public void setDesconto(double desconto) {
        super.setDesconto(10/100);
    }

    @Override
    public double preco_a_vista() {
        return getPreco() - (0.1 * DESCONTO_FIXO());
    }
}