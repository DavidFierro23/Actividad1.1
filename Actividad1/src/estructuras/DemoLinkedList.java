package estructuras;

public class DemoLinkedList {
    public static void main(String[] args) {
        // — Sector Financiero
        LinkedListFinance listaFin = new LinkedListFinance();
        listaFin.insertarAlFinal("2901125", "Christian Merchán");
        listaFin.insertarAlFinal("2901126", "Lucía Pérez");
        listaFin.insertarAlFinal("2901127", "Jorge Andrade");
        listaFin.insertarAlFinal("2901128", "Carlos López");
        listaFin.insertarAntes("2901127", "2901126.5", "Nuevo Nodo");
        listaFin.imprimirEstilo();

        // — Sector Salud
        LinkedListSalud listaSal = new LinkedListSalud();
        listaSal.insertarAlFinal("A0102", "Christian Merchán", "Astrazeneca", 2);
        listaSal.insertarAlFinal("A0103", "Lucía Pérez",      "Pfizer",     1);
        listaSal.insertarAlFinal("A0104", "Jorge Andrade",    "China",      1);
        listaSal.insertarAlFinal("A0105", "Carlos López",     "Rusa",       2);
        // Si quisieras usar insertarAntes en Salud tranquilamente se agrega uno nuevo
        listaSal.insertarAntes("A0104", "A0103.5", "Paciente Nuevo", "Moderna", 1);
        listaSal.imprimirEstilo();
    }
}
