public class FabricaAlertaConsola extends FabricaAlerta {
    public Alerta crearAlerta() {
        return new AlertaConsola();
    }
}