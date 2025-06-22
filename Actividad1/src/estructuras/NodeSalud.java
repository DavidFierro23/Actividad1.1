package estructuras;

public class NodeSalud {
    public String id;
    public String nombrePaciente;
    public String vacuna;
    public int dosis;
    public NodeSalud next;

    public NodeSalud(String id, String nombrePaciente, String vacuna, int dosis) {
        this.id = id;
        this.nombrePaciente = nombrePaciente;
        this.vacuna = vacuna;
        this.dosis = dosis;
        this.next = null;
    }
}
