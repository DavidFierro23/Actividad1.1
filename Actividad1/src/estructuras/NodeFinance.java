package estructuras;

public class NodeFinance {
    public String id;
    public String nombreCliente;
    public NodeFinance next;

    public NodeFinance(String id, String nombreCliente) {
        this.id = id;
        this.nombreCliente = nombreCliente;
        this.next = null;
    }
}
