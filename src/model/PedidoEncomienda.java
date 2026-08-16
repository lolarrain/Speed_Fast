package model;

public class PedidoEncomienda extends Pedido {

    /**
     * Constructor de un pedido de encomienda.
     *
     * @param idPedido identificador del pedido
     * @param direccionEntrega dirección de entrega
     */
    public PedidoEncomienda(int idPedido, String direccionEntrega) {
        super(idPedido, direccionEntrega, "Encomienda");
    }

    /**
     * Valida las condiciones de la encomienda antes de asignar repartidor.
     */
    @Override
    public void asignarRepartidor() {
        System.out.println("Pedido #" + getIdPedido() + " - Encomienda");
        System.out.println("Validando peso y embalaje...");
        System.out.println("Buscando repartidor disponible...");
    }

    /**
     * Asigna un repartidor considerando peso y embalaje.
     *
     * @param nombreRepartidor nombre del repartidor
     */
    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Repartidor asignado: " + nombreRepartidor);
        System.out.println("Validación: peso y embalaje deben ser adecuados.");
    }
}