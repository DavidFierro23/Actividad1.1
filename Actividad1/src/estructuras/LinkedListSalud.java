package estructuras;

import java.util.ArrayList;
import java.util.List;

public class LinkedListSalud {
    private NodeSalud head;

    /** Inserta un nuevo nodo al final de la lista */
    public void insertarAlFinal(String id, String nombre, String vacuna, int dosis) {
        NodeSalud nuevo = new NodeSalud(id, nombre, vacuna, dosis);
        if (head == null) {
            head = nuevo;
        } else {
            NodeSalud curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = nuevo;
        }
    }

    /** Inserta un nuevo nodo antes del nodo cuya id coincide con idExistente */
    public void insertarAntes(String idExistente, String idNuevo, String nombreNuevo,
                              String vacunaNuevo, int dosisNuevo) {
        NodeSalud nuevo = new NodeSalud(idNuevo, nombreNuevo, vacunaNuevo, dosisNuevo);
        if (head == null) return;
        if (head.id.equals(idExistente)) {
            nuevo.next = head;
            head = nuevo;
            return;
        }
        NodeSalud prev = head;
        NodeSalud curr = head.next;
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
        List<NodeSalud> nodes = new ArrayList<>();
        NodeSalud curr = head;
        while (curr != null) {
            nodes.add(curr);
            curr = curr.next;
        }

        System.out.println("\nLista Enlazada – Sector Salud \n");

        for (int i = 0; i < nodes.size(); i++) {
            NodeSalud n = nodes.get(i);
            String nextIdx = (i + 1 < nodes.size()) ? String.valueOf(i + 1) : "null";

            
            System.out.println("+----------------------------------------------------+");
            System.out.printf("| [Indice: %d]                           [Indice siguiente: %s] |\n",
                              i, nextIdx);
            System.out.println("+----------------------------------------------------+");

            
            System.out.printf("| ID               : %s\n", n.id);
            System.out.printf("| Nombre paciente  : %s\n", n.nombrePaciente);
            System.out.printf("| Vacuna           : %s\n", n.vacuna);
            System.out.printf("| Número de dosis  : %d\n", n.dosis);
            System.out.println("+----------------------------------------------------+\n");
        }
    }
}
