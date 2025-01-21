![Badge-Conversor](https://github.com/user-attachments/assets/8edd2121-11fa-4afd-bb6c-6996d5868c5a)

<h1 align="center"> Challenge_Conversor de monedas🧮</h1>

<h1 style="text-align: left;">Descripcion📝</h1>
Este proyecto es una aplicacion que permite hacer cambios de tasa según la moneda y su valor actual en el mercado mediante el consumo de una API.🚀
<h1 style="text-align: left;">Estado del proyecto: Finalizado📎</h1>
<h1 style="text-align: left;">Tecnologías empleadas </h1>
- **Java 17**

- **API a consumir** "https://v6.exchangerate-api.com/v6/tu_api_key/latest/USD"

- **Biblioteca Gson** esto para el analisis de la API, se debe de buscar mediante el mvn repository

<h1 style="text-align: left;">✏️ Requisitos Previos 📖</h1>

1. Java Development Kit (JDK) 17 o superior.
2. Un entorno de desarrollo como preferiblemenete IntelliJ IDEA.
3. Biblioteca Gson de mvn repository

<h1 style="text-align: left;">Tutorial de Uso e instalación 🖥️</h1>
1. Clona este repositorio e instalalo en tu computadora:

    ```bash
    [git clone [https://github.com/tu-usuario/literalura.git](https://github.com/zIFelipe/Challenge_LiterAlura.git)
    cd LiterAlura](https://github.com/zIFelipe/Challenge_ConversorDeMonedas.git)
    ```
    
2. Utiliza una IDE compatible con Java, preferiblemente IntelliJ IDEA.
   
3. Compila el programa mediante "main", en caso de no saber que hacer, revisar las capturas de pantalla adjuntas en el readme.
   

    

<h1 style="text-align: left;">Funciones 💡</h1>

### Clases y estructura principal:

#### `ConversorMonedas`:
- **ConversorMonedas**: La clase principal que ejecuta el inicio de la aplicación y coordina la ejecución del resto del sistema, aqui se encuentran las funciones principales del proyecto.

---

### Paquete: `model` 🏷️
Este paquete contiene la clase moneda, la cual define la estructura del objeto moneda.

---

### Paquete: `principal` 📦
Este paquete contiene la clase principal para ejecutar el sistema donde se encuentra el menu para ejecutar las funciones.


### Paquete: `servicio` 🔧
Este paquete contiene la lógica de negocio y la interacción con los servicios externos, como el consumo de la API y la conversión de datos.

#### Clases en `service`:

- **ConsumoAPI**: Clase que se encarga de consumir la API externa para obtener datos de las monedas.

- **ConversionesCalculadora**: Clase que maneja las conversiones para el cambio de las monedas.

- **JsonAnalizador**: sirve para analizar y extraer datos de un objeto JSON que representa tasas de conversión de monedas..

---
<h1 style="text-align: left;">Desarrollado por 🎓</h1>
**Luis Felipe Méndez González 📠**  

---

<h1 style="text-align: left;">Capturas del funcionamientos 🎓</h1>
Aqui se verá como funciona el programa, es el mismo proceso para las demas conversiones

![prueba de como usar el conversor](https://github.com/user-attachments/assets/383f3f57-e6f1-448a-b25c-47272768e725)

<h1 style="text-align: left;">Consideraciones adicionales📝</h1>
Leer el apartado de "Importante" a la hora de iniciar el programa
