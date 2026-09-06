public class SistemaAeropuerto {
    public static void main(String[] args) {
        // Inicialización de la Matriz 4x4
        Puerta[][] terminal = new Puerta[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                terminal[i][j] = new Puerta();
            }
        }

        // --- Simulacro de Carga de Datos ---
        // Puerta [0,0] (3 pasajeros)
        terminal[0][0].agregarPasajero("Ana Lopez", 'S');
        terminal[0][0].agregarPasajero("Pedro Perez", 'E');
        terminal[0][0].agregarPasajero("Maria Garcia", 'S');

        // Puerta [1,2] (1 pasajero)
        terminal[1][2].agregarPasajero("Juan Castro", 'E');

        // Puerta [3,3] (2 pasajeros)
        terminal[3][3].agregarPasajero("Luis Rojas", 'S');
        terminal[3][3].agregarPasajero("Elena Sanz", 'S');

        // --- Generación de Reporte General ---
        System.out.println("=== REPORTE DE ESTADO DE EMBARQUE ===");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int[] stats = terminal[i][j].obtenerEstadisticas();
                int total = stats[0] + stats[1];
                if (total > 0) {
                    System.out.printf("Puerta [%d,%d]: %d pasajeros (Gold: %d, Estandar: %d)\n",
                            i, j, total, stats[0], stats[1]);
                } else {
                    System.out.printf("Puerta [%d,%d]: VACÍA\n", i, j);
                }
            }
        }

        // --- Prueba de Despegue (Vaciado) ---
        System.out.println("\n--- Avión de la Puerta [0,0] ha despegado ---");
        terminal[0][0].vaciarPuerta();

        int[] postStats = terminal[0][0].obtenerEstadisticas();
        System.out.println("Nuevo estado Puerta [0,0]: " + (postStats[0] + postStats[1]) + " pasajeros.");
    }
}