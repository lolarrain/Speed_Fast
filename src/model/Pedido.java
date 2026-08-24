package model;

/**
 * Clase abstracta que representa un pedido genérico de SpeedFast.
 * Contiene los atributos y comportamientos comunes a todos los tipos de pedido.
 */
public abstract class Pedido {

    private int idPedido;
    private String direccionEntrega;
    private double distanciaKm;

    /**
     * Constructor de la clase Pedido.
     *
     * @param idPedido identificador único del pedido
     * @param direccionEntrega dirección donde se realizará la entrega
     * @param distanciaKm distancia de la entrega en kilómetros
     */
    public Pedido(int idPedido, String direccionEntrega, double distanciaKm) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.distanciaKm = distanciaKm;
    }

    /**
     * Muestra los datos básicos del pedido.
     */
    public void mostrarResumen() {
        System.out.println("ID Pedido: " + idPedido);
        System.out.println("Dirección de entrega: " + direccionEntrega);
        System.out.println("Distancia: " + distanciaKm + " km");
    }

    /**
     * Calcula el tiempo estimado de entrega.
     * Cada tipo de pedido debe implementar su propia lógica.
     *
     * @return tiempo estimado de entrega en minutos
     */
    public abstract int calcularTiempoEntrega();

    public int getIdPedido() {
        return idPedido;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }
}