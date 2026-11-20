public class AlertaArchivo implements Alerta {
    private String registro = "";

    public void emitir(String mensaje) {
        registro = registro + "[LOG] " + mensaje + "\n";
        System.out.println("Guardado en registro: [LOG] " + mensaje);
    }
}