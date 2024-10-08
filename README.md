# Quiz 1 Primer Corte
# Sistema de Administración de Colección de Libros Electrónicos y Audiolibros

### Universidad de Cundinamarca
### Linea de Profundizacion III
### Nicolas Guzman Montaña


Este proyecto es un sistema simple desarrollado en Kotlin para administrar una colección de libros electrónicos y audiolibros. Permite al usuario agregar, mostrar, eliminar y ver detalles de cada medio en la colección.

## Características

- **Agregar Medio**: Opción para agregar libros electrónicos o audiolibros a la colección.
- **Mostrar Colección**: Muestra todos los medios en la colección, organizados por tipo (libros electrónicos primero y audiolibros después).
- **Mostrar Información del Medio**: Permite al usuario seleccionar un medio por su posición e invoca el método para mostrar los detalles del medio seleccionado.
- **Eliminar Medio**: Permite al usuario seleccionar un medio para eliminarlo de la colección.
- **Control de Errores**: Verifica que los datos ingresados sean del tipo correcto (letras para títulos y autores, números para años de publicación).

## Estructura del Proyecto

El proyecto está dividido en varias clases:

- **`Main`**: Contiene el menú interactivo y el flujo principal de la aplicación.
- **`MedioDigital`**: Clase base que define las propiedades comunes de todos los medios digitales.
- **`LibroElectronico`**: Clase derivada de `MedioDigital` que representa un libro electrónico, con una propiedad adicional para el número de páginas.
- **`Audiolibro`**: Clase derivada de `MedioDigital` que representa un audiolibro, con una propiedad adicional para el narrador.
- **`ColeccionDeMedios`**: Clase que maneja la colección de medios, incluyendo funciones para agregar, mostrar, eliminar y ver información de los medios.

Para este proyecto se usó la IA para implementar el control de errores en los strings y en los ints, también para comentar algunas cosas y crear este archivo README.
## Cómo Usar

1. **Clona el repositorio**:
   ```bash
   git clone https://github.com/tu_usuario/tu_repositorio.git
