public class Puerta {
    Pasajero cabeza;

    // Agregar al final para mantener el orden de llegada
    public void agregarPasajero(String nombre, char tipo) {
        Pasajero nuevo = new Pasajero(nombre, tipo);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Pasajero temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevo;
        }
    }

    // Conteo y análisis de estadísticas (Socio Gold vs. Estándar)
    public int[] obtenerEstadisticas() {
        int gold = 0;
        int estandar = 0;
        Pasajero temp = cabeza;
        while (temp != null) {
            if (temp.tipo == 'S') {
                gold++;
            } else {
                estandar++;
            }
            temp = temp.siguiente;
        }
        return new int[]{gold, estandar}; // Retorna [Gold, Estándar]
    }

    // Vacía la puerta al despegar el avión
    public void vaciarPuerta() {
        cabeza = null; // El Garbage Collector de Java se encarga de liberar la memoria
    }
}