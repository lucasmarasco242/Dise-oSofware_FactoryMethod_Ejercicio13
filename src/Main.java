public class Main {
    public static void main(String[] args) {
        FabricaAlerta fabricaConsola = new FabricaAlertaConsola();
        Alerta alertaConsola = fabricaConsola.crearAlerta();
        alertaConsola.emitir("CPU al 95% en servidor-01.");

        FabricaAlerta fabricaArchivo = new FabricaAlertaArchivo();
        Alerta alertaArchivo = fabricaArchivo.crearAlerta();
        alertaArchivo.emitir("Disco al 90% en servidor-02.");
    }
}