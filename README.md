# Tests jUnit con sistema de registro de libros

El código fue desarrollado en Java 8 utilizando JUnit 5.8.1.

## Acerca de

La tarea consiste en construir una aplicación de registro de libro en una biblioteca :

Búsqueda de libros
Edición de libros
Borrar Libros
Cambio de estado

## Test a implementar

|ítem	| Detalle| 
|---- | ---- |
|Test Busqueda titulo|	|
|Test Busqueda autor	||
|Test Busqueda ISBN|	|

## Requerimientos
- Es necesario tener instalado [Gradle](https://gradle.org/)
- Clonar el repositorio en la carpeta deseada, desde la consola:
```
git clone https://github.com/Kaspituela/JUnit_Java
```
- Acceder a la carpeta del proyecto:
```
cd ./JUnit_Java
```

## Ejecución
Para ejecutar el proyecto, se debe ejecutar este comando en la carpeta raíz:
```
gradle run
``` 
## Pruebas
Para ejecutar las pruebas unitarias se debe utilizar el comando:
```
gradle clean test
```
Al ejecutar las pruebas se genera el archivo:
```
./build/reports/tests/test/index.html
```
Este archivo contiene un reporte con los resultados de todas las pruebas ejecutadas, se puede abrir en cualquier navegador.

## Archivos proyecto
Se tienen los siguientes archivos,  en ``./src/main/java/test/`` se encuentra:
- `Libro.java`, el cual contiene la estructura del objeto Libro.
- `Main.java`, el cual utiliza la lógica de las entradas por consola y el manejo de las opciones.

Por otro lado, en `./src/test/java/test/`:
- `LibroTest.java`, que contiene todas las pruebas unitarias.
