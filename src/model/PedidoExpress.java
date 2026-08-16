package model;

public class PedidoExpress extends Pedido {

    /**
     * Constructor de un pedido express.
     *
     * @param idPedido identificador del pedido
     * @param direccionEntrega dirección de entrega
     */
    public PedidoExpress(int idPedido, String direccionEntrega) {
        super(idPedido, direccionEntrega, "Compra Express");
    }

    /**
     * Busca al repartidor disponible más cercano.
     */
    @Override
    public void asignarRepartidor() {
        System.out.println("Pedido #" + getIdPedido() + " - Compra Express");
        System.out.println(
                "Buscando al repartidor más cercano con disponibilidad inmediata..."
        );
    }

    /**
     * Asigna un repartidor verificando cercanía y disponibilidad.
     *
     * @param nombreRepartidor nombre del repartidor
     */
    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Repartidor asignado: " + nombreRepartidor);
        System.out.println(
                "Validación: debe estar cercano y disponible inmediatamente."
        );
    }
}