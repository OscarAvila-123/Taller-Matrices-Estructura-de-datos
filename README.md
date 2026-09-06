# Talleres de Estructuras de Datos en Java

Este repositorio contiene las soluciones implementadas en Java para dos casos de estudio prácticos: la gestión del estado de embarque en un terminal de aeropuerto mediante matrices y listas enlazadas simples, y el análisis de ventas de inventario mediante matrices multidimensionales.

---

## 🛠️ Proyectos Incluidos

### 1. Sistema de Gestión de Embarque (`src/sistema_aeropuerto/`)
Simula las puertas de embarque de una terminal de aeropuerto estructuradas en una **matriz 4x4**. Cada celda contiene una **lista enlazada simple** que gestiona la cola de pasajeros en orden de llegada y distingue su categoría (`S` para Socio Gold y `E` para Estándar).

* **`Pasajero.java`**: Nodo que almacena el nombre del pasajero, su tipo de membresía y la referencia al siguiente nodo.
* **`Puerta.java`**: Gestión de la lista enlazada (inserción al final, cálculo de estadísticas por tipo de usuario y vaciado de la lista).
* **`SistemaAeropuerto.java`**: Clase principal que inicializa la matriz 4x4, realiza la carga de datos de prueba, imprime el reporte general y simula el despegue de un avión.

#### Funcionalidades Principales:
* Inserción ordenada al final de la cola por puerta.
* Generación de reportes de ocupación y desglose de tipo de pasajero por puerta.
* Liberación de memoria de la lista mediante la desreferenciación del nodo cabeza (`cabeza = null`).

---

### 2. Gestor de Inventario de Frutas (`src/inventario_frutas/`)
Programa en Java para el control de inventario y ventas semanales utilizando matrices bidimensionales (4 frutas x 5 días).

* **`GestorInventarioFrutas.java`**: Procesa la matriz de ventas para extraer datos estadísticos clave.

#### Funcionalidades Principales:
1. **Total de ventas por fruta**: Suma iterativa por filas.
2. **Día de mayor venta total**: Suma iterativa por columnas e identificación del valor máximo.
3. **Alertas de stock bajo**: Evaluación de celdas con ventas menores a 5 unidades para generar alertas de reabastecimiento.

---

## 🚀 Cómo Ejecutar los Proyectos

### Requisitos Previos
* **Java JDK** 8 o superior instalado.

### Comandos de Compilación y Ejecución (vía Terminal)

1. Clonar el repositorio:
   ```bash
   git clone [https://github.com/TU-USUARIO/Estructura-Datos-Java.git](https://github.com/TU-USUARIO/Estructura-Datos-Java.git)
   cd Estructura-Datos-Java
