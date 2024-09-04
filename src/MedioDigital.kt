// Clase base MedioDigital que contiene las propiedades comunes
open class MedioDigital(
    val titulo: String,
    val autor: String,
    val añoPublicacion: Int
) {
    // Método que será sobrescrito por las clases derivadas para mostrar la información del medio
    open fun mostrarInformacion(): String {
        return "Título: $titulo, Autor: $autor, Año de Publicación: $añoPublicacion"
    }
}
