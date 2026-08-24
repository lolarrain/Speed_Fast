# SpeedFast S2

Proyecto desarrollado en Java que representa un sistema básico de pedidos para una empresa de reparto a domicilio. El sistema utiliza una jerarquía de clases para modelar distintos tipos de entrega y calcular su tiempo estimado según reglas específicas.

## Conceptos aplicados

- Abstracción
- Encapsulamiento
- Herencia
- Polimorfismo
- Sobrescritura de métodos
- Colecciones genéricas

La clase abstracta `Pedido` contiene los atributos y comportamientos comunes, además del método abstracto `calcularTiempoEntrega()`, implementado de forma diferente por cada clase derivada.

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