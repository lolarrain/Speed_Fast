public class PedidoEncomienda extends Pedido {

    /**
     * Constructor para un pedido de encomienda.
     *
     * @param idPedido identificador del pedido
     * @param direccionEntrega dirección de entrega
     */
    public PedidoEncomienda(int idPedido, String direccionEntrega) {
        super(idPedido, direccionEntrega, "Encomienda");
    }

    /**
     * Busca un repartidor después de validar peso y embalaje.
     */
    @Override
    public void asignarRepartidor() {
        System.out.println("Pedido #" + getIdPedido() + " - Encomienda");
        System.out.println("Validando peso y condiciones del embalaje...");
        System.out.println("Buscando repartidor disponible...");
    }

    /**
     * Asigna un repartidor considerando las validaciones de la encomienda.
     *
     * @param nombreRepartidor nombre del repartidor
     */
    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Repartidor asignado: " + nombreRepartidor);
        System.out.println("Validación: peso y embalaje deben ser adecuados.");
    }
}
