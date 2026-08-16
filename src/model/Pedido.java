package model;

public class Pedido {

    private int idPedido;
    private String direccionEntrega;
    private String tipoPedido;

    /**
     * Constructor de la clase Pedido.
     *
     * @param idPedido identificador del pedido
     * @param direccionEntrega dirección donde debe realizarse la entrega
     * @param tipoPedido tipo de pedido
     */
    public Pedido(int idPedido, String direccionEntrega, String tipoPedido) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.tipoPedido = tipoPedido;
    }

    /**
     * Realiza una asignación genérica de repartidor.
     */
    public void asignarRepartidor() {
        System.out.println("Buscando un repartidor disponible...");
    }

    /**
     * Asigna un repartidor específico.
     *
     * @param nombreRepartidor nombre del repartidor
     */
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Repartidor asignado: " + nombreRepartidor);
    }

    public int getIdPedido() {
        return idPedido;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public String getTipoPedido() {
        return tipoPedido;
    }
}