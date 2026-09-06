public class Pasajero {
    String nombre;
    char tipo; // 'S' para Socio Gold, 'E' para Estándar
    Pasajero siguiente;

    public Pasajero(String nombre, char tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.siguiente = null;
    }
}