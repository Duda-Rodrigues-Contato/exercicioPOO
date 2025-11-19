public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}


class Pedido {

    private int numPedido;
    private String nomeCliente;
    private double valorPedido;

    public Pedido(int numPedido, String nomeCliente, double valorPedido) {
        
        this.numPedido = numPedido;
        this.nomeCliente = nomeCliente;
        this.valorPedido = valorPedido;

    }

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(double valorPedido) {
        this.valorPedido = valorPedido;
    }

}