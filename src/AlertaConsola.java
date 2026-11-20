public class AlertaConsola implements Alerta {
    public void emitir(String mensaje) {
        System.out.println("[CONSOLA] " + mensaje);
    }
}