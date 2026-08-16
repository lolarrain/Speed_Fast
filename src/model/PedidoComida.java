package model;

public class PedidoComida extends Pedido {

    /**
     * Constructor de un pedido de comida.
     *
     * @param idPedido identificador del pedido
     * @param direccionEntrega dirección de entrega
     */
    public PedidoComida(int idPedido, String direccionEntrega) {
        super(idPedido, direccionEntrega, "Comida");
    }

    /**
     * Busca un repartidor con mochila térmica.
     */
    @Override
    public void asignarRepartidor() {
        System.out.println("Pedido #" + getIdPedido() + " - Comida");
        System.out.println("Buscando repartidor disponible con mochila térmica...");
    }

    /**
     * Asigna un repartidor y verifica el requisito de mochila térmica.
     *
     * @param nombreRepartidor nombre del repartidor
     */
    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Repartidor asignado: " + nombreRepartidor);
        System.out.println("Validación: debe contar con mochila térmica.");
    }
}
