// OK
public class questao2 {
    
}

public class Celular extends Mercadoria {
    @Override
    public double preco_a_vista() {
        return getPreco() - (getPreco() * getDesconto()/100); 
    }
}
