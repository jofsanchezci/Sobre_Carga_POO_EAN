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
