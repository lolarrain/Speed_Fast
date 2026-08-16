# SpeedFast - Desarrollo Orientado a Objetos II

## Descripción general

SpeedFast es un sistema desarrollado en Java que representa la gestión básica de pedidos de reparto a domicilio. El programa contempla pedidos de comida, encomiendas y compras express, aplicando distintos criterios de asignación de repartidores según las necesidades de cada tipo de servicio.

El proyecto utiliza programación orientada a objetos para organizar estas reglas mediante herencia, polimorfismo, sobrescritura y sobrecarga de métodos.

## Estructura del proyecto
```text
src
├── app
│   └── Main.java
│
└── model
    ├── Pedido.java
    ├── PedidoComida.java
    ├── PedidoEncomienda.java
    └── PedidoExpress.java
```

`app`: contiene la clase Main, encargada de ejecutar y probar el funcionamiento del sistema.

`model`: contiene la clase base Pedido y las clases especializadas para cada tipo de servicio.
