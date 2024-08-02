
## Authors

- [@Fernando Juarez Medina](https://github.com/FernandoRIT-collab)

## Prerrequisitos

Antes de ejecutar el proyecto, asegúrate de tener instalado el siguientes programas en tu sistema:

- **Java JDK 17** o superior

## Instalación

Sigue estos pasos para configurar el proyecto en tu entorno local:

1. **Clona el repositorio:**
  
    git clone https://github.com/FernandoRIT-collab/PruebaTecnicaEBC.git

2. **Abrir el proyecto:**

Abrir el proyecto en tu IDE de preferencia en caso de estar comprimido descomprimir.

3. **Ejecutar proyecto**

Aplicar un Clean and build Si es necesario, y se cargaran las dependencias de maeven y ya podra ser ejecutado

## Uso

La API ofrece las siguientes rutas:

### 1. Ruta de Ejemplo 1

- **Método HTTP:** PUT
- **URL:** `/api/secuence/fizzbuzz`
- **Descripción:** [Ejecuta la funcion de fizzBuzz que si es divisible por 3 escriba Fizz y si es divisible por 5 escriba Buzz y si es divisible por ambos escriba FizzBuzz y si no cumple con ninguna condicion se imprima el numero.]
- **Ejemplo de Solicitud:**

    ```bash
     PUT http://localhost:8080/api/secuence/fizzbuzz?n=18
    ```

- **Ejemplo de Respuesta:**

    ```json
    {
      "1",
      "2",
      "Fizz",
      "4",
      "Buzz",
      "Fizz",
      "7",
      "8",
      "Fizz",
      "Buzz",
      "11",
      "Fizz",
      "13",
      "14",
      "FizzBuzz",
      "16",
      "17",
      "Fizz"
    }
    ```
### 2. Ruta de Ejemplo 2

- **Método HTTP:** PUT
- **URL:** `/api/secuence/collatz`
- **Descripción:** [La conjetura de Collatz afirma que, al partir desde cualquier número, la secuencia siempre llegará a 1. A pesar de ser una afirmación a simple vista muy simple, no se ha podido demostrar si es cierta o no.]

- **Ejemplo de Solicitud:**

    ```bash
     PUT http://localhost:8080/api/secuence/collatz?n=20
    ```
- **Ejemplo de Respuesta:**

    ```json
    {
      20,
      10,
      5,
      16,
      8,
      4,
      2,
      1
    }


    ```
