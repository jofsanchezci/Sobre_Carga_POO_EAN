
# Implementación de la Clase Pedido en Java

## Concepto de Sobrecarga de Métodos

La sobrecarga de métodos es un concepto en programación orientada a objetos donde una clase puede tener varios métodos con el mismo nombre pero con diferentes parámetros. Esto permite a los métodos realizar acciones similares pero con distintos tipos o cantidades de argumentos, mejorando la legibilidad y mantenibilidad del código.

## Implementación en Java

La clase `Pedido` incluye varios métodos sobrecargados para calcular el total del pedido basado en diferentes combinaciones de platos. Aquí está la implementación:

```java
public class Pedido {
    // Métodos sobrecargados para calcular el costo del pedido

    // Primer plato y bebida
    public double calcularCosto(String primerPlato, double precioPrimerPlato, String bebida, double precioBebida) {
        return precioPrimerPlato + precioBebida;
    }

    // Primer plato, segundo plato y bebida
    public double calcularCosto(String primerPlato, double precioPrimerPlato, String segundoPlato, double precioSegundoPlato, String bebida, double precioBebida) {
        return precioPrimerPlato + precioSegundoPlato + precioBebida;
    }

    // Primer plato, segundo plato, bebida y postre
    public double calcularCosto(String primerPlato, double precioPrimerPlato, String segundoPlato, double precioSegundoPlato, String bebida, double precioBebida, String postre, double precioPostre) {
        return precioPrimerPlato + precioSegundoPlato + precioBebida + precioPostre;
    }

    // Método main para probar los métodos sobrecargados
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        
        // Ejemplo de pedido 1: primer plato y bebida
        System.out.println("Costo del Pedido 1: " + pedido.calcularCosto("Ensalada", 10.0, "Agua", 1.5));
        
        // Ejemplo de pedido 2: primer plato, segundo plato y bebida
        System.out.println("Costo del Pedido 2: " + pedido.calcularCosto("Ensalada", 10.0, "Pasta", 12.0, "Vino", 5.0));
        
        // Ejemplo de pedido 3: primer plato, segundo plato, bebida y postre
        System.out.println("Costo del Pedido 3: " + pedido.calcularCosto("Ensalada", 10.0, "Pasta", 12.0, "Vino", 5.0, "Helado", 3.0));
    }
}
```

## Explicación

1. **Sobrecarga de Métodos**: La clase `Pedido` utiliza la sobrecarga para definir tres versiones del método `calcularCosto`, cada una aceptando diferentes combinaciones de parámetros para distintos tipos de pedidos.

2. **Main para Pruebas**: El método `main` crea una instancia de `Pedido` y llama a los métodos sobrecargados para calcular el costo de diferentes tipos de pedidos, demostrando cómo la misma acción (calcular costos) se maneja para diferentes configuraciones de entrada.

Esta implementación permite flexibilidad y claridad, facilitando la expansión o modificación futura del sistema para incluir más opciones de platos.
