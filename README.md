
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

# Ejercicios:
Implementar los siguientes Métodos

- Método Sumar para dos enteros: Definir un método sumar que obtenga la suma de dos valores enteros pasados como parámetros.
- Método Sumar para tres enteros: Definir un método sumar que obtenga la suma de tres valores enteros pasados como parámetros.
- Método Sumar para dos doubles: Definir un método sumar que obtenga la suma de dos valores double pasados como parámetros.
- Método Sumar para tres doubles: Definir un método sumar que obtenga la suma de tres valores double pasados como parámetros.

# Sobrecarga de Constructores en Java

## Concepto de Sobrecarga de Constructores

La sobrecarga de constructores permite a una clase en Java tener más de un constructor, cada uno con diferentes listas de argumentos. Esto es útil para crear instancias de un objeto de varias maneras, dependiendo de la información disponible en el momento de la creación.

### Utilización de `this` en Constructores

Cuando se sobrecargan constructores, se puede usar la palabra clave `this` para invocar a otro constructor dentro de la misma clase. Esto ayuda a reutilizar el código y a mantener la inicialización en un solo lugar. La llamada a `this()` debe ser la primera línea del constructor que la invoca.

## Implementación de la Clase `ArticuloCientifico`

Se define una clase `ArticuloCientifico` en Java con tres constructores sobrecargados:

1. **Constructor básico:** Inicializa el artículo con título y autor.
2. **Constructor intermedio:** Incluye título, autor, palabras clave, nombre de publicación y año, y reutiliza el primer constructor.
3. **Constructor completo:** Incluye todos los metadatos y reutiliza el segundo constructor.

```java
public class ArticuloCientifico {
    private String titulo;
    private String autor;
    private String palabrasClaves;
    private String nombrePublicacion;
    private int anio;
    private String resumen;

    // Constructor básico
    public ArticuloCientifico(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Constructor intermedio
    public ArticuloCientifico(String titulo, String autor, String palabrasClaves, String nombrePublicacion, int anio) {
        this(titulo, autor);  // Reutiliza el constructor básico
        this.palabrasClaves = palabrasClaves;
        this.nombrePublicacion = nombrePublicacion;
        this.anio = anio;
    }

    // Constructor completo
    public ArticuloCientifico(String titulo, String autor, String palabrasClaves, String nombrePublicacion, int anio, String resumen) {
        this(titulo, autor, palabrasClaves, nombrePublicacion, anio);  // Reutiliza el constructor intermedio
        this.resumen = resumen;
    }

    // Método para imprimir los detalles del artículo
    public void imprimirDetalles() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Palabras claves: " + palabrasClaves);
        System.out.println("Nombre de la publicación: " + nombrePublicacion);
        System.out.println("Año: " + anio);
        System.out.println("Resumen: " + resumen);
    }

    // Método main para probar los constructores
    public static void main(String[] args) {
        ArticuloCientifico articulo = new ArticuloCientifico("Avances en IA", "Juan Perez", "IA, Machine Learning", "Revista Científica", 2024, "Este artículo explora...");
        articulo.imprimirDetalles();
    }
}
```

### Explicación de la Implementación

- **Constructores Sobrecargados:** Tres constructores que permiten la creación de objetos `ArticuloCientifico` con diferentes niveles de detalle.
- **Reutilización con `this`:** Cada constructor más complejo reutiliza el constructor anterior mediante la llamada a `this(...)`, promoviendo la reutilización de código y la centralización de la lógica de inicialización.
- **Impresión de Detalles:** Un método para imprimir todos los campos del artículo, demostrando la efectividad de la sobrecarga y la inicialización a través de diferentes constructores.

# Ejericios Sobre Carga Constructores

1. Definir una clase Empleado que tiene como atributos: identifica-
dor, nombre, apellidos y edad del empleado. La clase contiene dos
constructores:
- El primer constructor no tiene parámetros e inicializa los atribu-
tos del objeto con los siguientes valores: identificador del emplea-
do con el valor 100, el nombre con “Nuevo empleado”, apellidos
con “Nuevo empleado” y edad del empleado con 18.
- El segundo constructor asigna valores a los atributos de acuer-
do con los valores pasados como parámetros.

2. Definir una clase Caja que tiene como atributos la longitud de su
base, anchura y altura. La clase contiene tres constructores:
- El primer constructor asigna valores a los atributos de acuerdo
con los valores pasados como parámetros.
- El segundo constructor inicializa todos los atributos de una caja
con valores de cero.
- El tercer constructor recibe un parámetro de longitud y les asig-
na dicho valor a todos sus atributos.
- Definir un nuevo atributo que represente el tipo de caja y un
nuevo constructor que reciba como parámetros los valores de
los cuatro atributos. Este constructor debe invocar al primero.

