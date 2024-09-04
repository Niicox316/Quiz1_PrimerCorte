import java.util.Scanner

// Clase principal que contiene el menú interactivo
fun main() {
    val coleccion = ColeccionDeMedios()
    val scanner = Scanner(System.`in`)

    while (true) {
        println("\n--- Menú de Colección de Medios ---")
        println("1. Agregar Libro Electrónico")
        println("2. Agregar Audiolibro")
        println("3. Mostrar Colección")
        println("4. Mostrar Información del Medio")
        println("5. Eliminar Medio")
        println("6. Salir")
        print("Seleccione una opción: ")

        val opcion = scanner.nextLine()

        when (opcion) {
            "1" -> {
                println("Ingrese el título del libro electrónico:")
                val titulo = scanner.nextLine()
                println("Ingrese el autor del libro electrónico:")
                val autor = scanner.nextLine()
                println("Ingrese el año de publicación del libro electrónico:")
                val añoPublicacion = solicitarNumero()
                println("Ingrese el número de páginas del libro electrónico:")
                val numeroPaginas = solicitarNumero()
                coleccion.agregarMedio(LibroElectronico(titulo, autor, añoPublicacion, numeroPaginas))
            }
            "2" -> {
                println("Ingrese el título del audiolibro:")
                val titulo = scanner.nextLine()
                println("Ingrese el autor del audiolibro:")
                val autor = scanner.nextLine()
                println("Ingrese el año de publicación del audiolibro:")
                val añoPublicacion = solicitarNumero()
                println("Ingrese el nombre del narrador del audiolibro:")
                val narrador = scanner.nextLine()
                coleccion.agregarMedio(Audiolibro(titulo, autor, añoPublicacion, narrador))
            }
            "3" -> coleccion.mostrarColeccion()
            "4" -> coleccion.mostrarInformacionDelMedio()
            "5" -> coleccion.eliminarMedio()
            "6" -> {
                println("Saliendo del sistema...")
                break
            }
            else -> println("Opción no válida.")
        }
    }
}

// Función para solicitar un número y validar la entrada
fun solicitarNumero(): Int {
    val scanner = Scanner(System.`in`)
    var numero: Int? = null
    while (numero == null) {
        try {
            numero = scanner.nextLine().toInt()
        } catch (e: NumberFormatException) {
            println("Entrada inválida. Por favor, ingrese un número válido:")
        }
    }
    return numero
}
