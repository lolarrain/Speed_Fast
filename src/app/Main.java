package app;

import model.Pedido;
import model.PedidoComida;
import model.PedidoEncomienda;
import model.PedidoExpress;

import java.util.List;

/**
 * Clase principal del sistema SpeedFast.
 */
public class Main {

    /**
     * Método principal para probar los distintos tipos de pedidos
     * utilizando una colección polimórfica.
     *
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {

        Pedido pedidoComida = new PedidoComida(
                101,
                "Av. Argentina 1234",
                4.0
        );

        Pedido pedidoEncomienda = new PedidoEncomienda(
                102,
                "Prat 850",
                5.0
        );

        Pedido pedidoExpress = new PedidoExpress(
                103,
                "Av. Brasil 450",
                7.0
        );

        List<Pedido> pedidos = List.of(
                pedidoComida,
                pedidoEncomienda,
                pedidoExpress
        );

        System.out.println("===== SPEEDFAST =====");

        for (Pedido pedido : pedidos) {

            System.out.println("\n----------------------------");

            pedido.mostrarResumen();

            System.out.println(
                    "Tiempo estimado de entrega: "
                            + pedido.calcularTiempoEntrega()
                            + " minutos"
            );
        }
    }
}