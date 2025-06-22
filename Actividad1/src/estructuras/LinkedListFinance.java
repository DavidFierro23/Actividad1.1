package estructuras;

import java.util.ArrayList;
import java.util.List;

public class LinkedListFinance {
    private NodeFinance head;

    /** Inserta un nuevo nodo al final de la lista */
    public void insertarAlFinal(String id, String nombre) {
        NodeFinance nuevo = new NodeFinance(id, nombre);
        if (head == null) {
            head = nuevo;
        } else {
            NodeFinance curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = nuevo;
        }
    }

    /** Inserta un nuevo nodo antes del nodo cuya id coincide con idExistente */
    public void insertarAntes(String idExistente, String idNuevo, String nombreNuevo) {
        NodeFinance nuevo = new NodeFinance(idNuevo, nombreNuevo);
        if (head == null) return;
        if (head.id.equals(idExistente)) {
            nuevo.next = head;
            head = nuevo;
            return;
        }
        NodeFinance prev = head;
        NodeFinance curr = head.next;
        while (curr != null && !curr.id.equals(idExistente)) {
            prev = curr;
            curr = curr.next;
        }
        if (curr != null) {
            prev.next = nuevo;
            nuevo.next = curr;
        }
    }

    public void imprimirEstilo() {
        // Recolectar nodos en una lista para saber sus índices
        List<NodeFinance> nodes = new ArrayList<>();
        NodeFinance curr = head;
        while (curr != null) {
            nodes.add(curr);
            curr = curr.next;
        }

        System.out.println("\nLista Enlazada – Sector Financiero \n");

        for (int i = 0; i < nodes.size(); i++) {
            NodeFinance n = nodes.get(i);
            String nextIdx = (i + 1 < nodes.size()) ? String.valueOf(i + 1) : "null";

            System.out.println("+------------------------------------------------+");
            System.out.printf("| [Indice: %d]                         [Indice siguiente: %s] |\n",
                              i, nextIdx);
            System.out.println("+------------------------------------------------+");

            System.out.printf("| ID             : %s\n", n.id);
            System.out.printf("| Información    : %s\n", n.nombreCliente);
            System.out.println("+------------------------------------------------+\n");
        }
    }
}
