// OK

public class Computaador extends Mercadoria {

    private String configuracao;
    private static final double desconto_fixo = 0.10;

    public String getConfiguracao() {
        return configuracao;
    }

    @Override
    public void setDesconto(double desconto) {
        super.setDesconto(10/100);
    }

    @Override
    public double preco_a_vista() {
        return getPreco() - (0.1 * desconto_fixo());
    }
}