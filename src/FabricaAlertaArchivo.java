public class FabricaAlertaArchivo extends FabricaAlerta {
    public Alerta crearAlerta() {
        return new AlertaArchivo();
    }
}