// Clase derivada de MedioDigital que representa un libro electrónico
class LibroElectronico(
    titulo: String,
    autor: String,
    añoPublicacion: Int,
    val numeroPaginas: Int
) : MedioDigital(titulo, autor, añoPublicacion) {

    // Sobrescribe el método mostrarInformacion para incluir el número de páginas
    override fun mostrarInformacion(): String {
        return "Libro Electrónico -> Título: $titulo, Autor: $autor, Año de Publicación: $añoPublicacion, Número de Páginas: $numeroPaginas"
    }
}
