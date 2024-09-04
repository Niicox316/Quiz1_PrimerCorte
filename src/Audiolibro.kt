// Clase derivada de MedioDigital que representa un audiolibro
class Audiolibro(
    titulo: String,
    autor: String,
    añoPublicacion: Int,
    val narrador: String
) : MedioDigital(titulo, autor, añoPublicacion) {

    // Sobrescribe el método mostrarInformacion para incluir el nombre del narrador
    override fun mostrarInformacion(): String {
        return "Audiolibro -> Título: $titulo, Autor: $autor, Año de Publicación: $añoPublicacion, Narrador: $narrador"
    }
}
