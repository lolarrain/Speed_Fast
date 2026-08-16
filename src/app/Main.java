public class Main {

    /**
     * Método principal para probar el sistema SpeedFast.
     *
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {

        Pedido pedido1 = new PedidoComida(
                101,
                "Av. Argentina 1234"
        );

        Pedido pedido2 = new PedidoEncomienda(
                102,
                "Prat 850"
        );

        Pedido pedido3 = new PedidoExpress(
                103,
                "Av. Brasil 450"
        );

        System.out.println("===== SPEEDFAST =====");

        System.out.println("\n--- PEDIDO DE COMIDA ---");
        pedido1.asignarRepartidor();
        pedido1.asignarRepartidor("Carlos");

        System.out.println("\n--- PEDIDO DE ENCOMIENDA ---");
        pedido2.asignarRepartidor();
        pedido2.asignarRepartidor("María");

        System.out.println("\n--- PEDIDO EXPRESS ---");
        pedido3.asignarRepartidor();
        pedido3.asignarRepartidor("Pedro");
    }
}