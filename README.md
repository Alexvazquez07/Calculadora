# Calculadora Entera (5 Dígitos)

Aplicación dividida en interfaz web (**HTML**) y lógica en **Java**, diseñada para trabajar **exclusivamente** con cuatro operaciones matemáticas y entradas enteras de hasta 5 dígitos en el rango `[-99999, 99999]`.

## Operaciones permitidas

- **Suma** (`+`)
- **Resta** (`-`)
- **Multiplicación** (`*`)
- **Potencias** (`^`)

## Regla de entrada

- Solo se aceptan números enteros dentro del intervalo `[-99999, 99999]` (hasta 5 dígitos con signo).
- No se permiten otras operaciones (como división, raíz o módulo) ni valores fuera de rango.

## Estructura de ramas en GitHub

El repositorio está organizado en tres ramas con responsabilidades separadas:

- **`main`**: Contiene merges de las ramas de trabajo y commits de documentación o comentarios.
- **`frontend`**: Contiene únicamente commits de archivos `.html` (`index.html`).
- **`backend`**: Contiene únicamente commits de archivos `.java` (`Operaciones.java` y `Calculadora.java`).

## Cómo ejecutar

### Interfaz HTML (`frontend`)
Abre `index.html` directamente en tu navegador web.

### Consola Java (`backend`)
Compila y ejecuta las clases desde terminal:

```bash
javac Operaciones.java Calculadora.java
java Calculadora
``` 
