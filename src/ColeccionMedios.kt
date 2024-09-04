import java.util.Scanner

// Clase para manejar la colección de medios digitales
class ColeccionDeMedios {
    private val medios = mutableListOf<MedioDigital>()

    // Función para agregar un nuevo medio a la colección
    fun agregarMedio(medio: MedioDigital) {
        medios.add(medio)
        println("Medio añadido a la colección.")
    }

    // Función para mostrar la colección dividida en Libros Electrónicos y Audiolibros
    fun mostrarColeccion() {
        println("\n--- Colección de Medios ---")

        // Mostrar Libros Electrónicos
        val libros = medios.filterIsInstance<LibroElectronico>()
        if (libros.isNotEmpty()) {
            println("\n--- Libros Electrónicos ---")
            libros.forEachIndexed { index, libro ->
                println("${index + 1}. ${libro.mostrarInformacion()}")
            }
        } else {
            println("\nNo hay Libros Electrónicos en la colección.")
        }

        // Mostrar Audiolibros
        val audiolibros = medios.filterIsInstance<Audiolibro>()
        if (audiolibros.isNotEmpty()) {
            println("\n--- Audiolibros ---")
            audiolibros.forEachIndexed { index, audiolibro ->
                println("${libros.size + index + 1}. ${audiolibro.mostrarInformacion()}")
            }
        } else {
            println("\nNo hay Audiolibros en la colección.")
        }
    }

    // Función para mostrar la información de un medio específico seleccionado por el usuario
    fun mostrarInformacionDelMedio() {
        if (medios.isEmpty()) {
            println("La colección está vacía.")
            return
        }

        println("Ingrese el número del medio que desea ver:")
        val scanner = Scanner(System.`in`)
        val indice = try {
            scanner.nextInt() - 1
        } catch (e: Exception) {
            -1
        }

        if (indice in medios.indices) {
            println(medios[indice].mostrarInformacion())
        } else {
            println("Índice inválido.")
        }
    }

    // Función para eliminar un medio de la colección
    fun eliminarMedio() {
        if (medios.isEmpty()) {
            println("La colección está vacía.")
            return
        }

        println("Ingrese el número del medio que desea eliminar:")
        val scanner = Scanner(System.`in`)
        val indice = try {
            scanner.nextInt() - 1
        } catch (e: Exception) {
            -1
        }

        if (indice in medios.indices) {
            medios.removeAt(indice)
            println("Medio eliminado de la colección.")
        } else {
            println("Índice inválido.")
        }
    }
}
