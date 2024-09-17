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
