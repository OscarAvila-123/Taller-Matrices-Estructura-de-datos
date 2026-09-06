public class GestorInventarioFrutas {
    public static void main(String[] args) {
        // Nombres de frutas y dias sin tildes
        String[] frutas = {"Manzanas", "Bananos", "Naranjas", "Peras"};
        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};

        // Matriz de ventas: 4 filas (frutas) x 5 columnas (dias)
        int[][] ventas = {
            {10, 15, 12, 8, 20}, // Manzanas (Fila 0)
            {30, 25, 40, 35, 50}, // Bananos  (Fila 1)
            {12, 10, 15, 20, 25}, // Naranjas (Fila 2)
            {5,  8,  4,  10, 7}   // Peras    (Fila 3)
        };

        // --- 1. Total de ventas por fruta ---
        System.out.println("=== 1. TOTAL DE VENTAS POR FRUTA ===");
        for (int i = 0; i < ventas.length; i++) { // Iteramos sobre las 4 frutas
            int sumaFruta = 0;
            for (int j = 0; j < ventas[i].length; j++) { // Iteramos sobre los 5 dias
                sumaFruta += ventas[i][j];
            }
            System.out.println(frutas[i] + ": " + sumaFruta + " unidades");
        }

        // --- 2. Dia de mayor venta total ---
        System.out.println("\n=== 2. DIA DE MAYOR VENTA TOTAL ===");
        int maxVentasDia = -1;
        int indiceDiaMax = 0;

        for (int j = 0; j < 5; j++) { // Iteramos sobre las 5 columnas (5 dias)
            int sumaDia = 0;
            for (int i = 0; i < 4; i++) { // Iteramos sobre las 4 filas (4 frutas)
                sumaDia += ventas[i][j];
            }
            if (sumaDia > maxVentasDia) {
                maxVentasDia = sumaDia;
                indiceDiaMax = j;
            }
        }
        System.out.println("El dia de mayor venta fue el " + dias[indiceDiaMax] + 
                           " (Indice " + indiceDiaMax + ") con " + maxVentasDia + " unidades.");

        // --- 3. Buscador de stock bajo (< 5 unidades) ---
        System.out.println("\n=== 3. ALERTAS DE STOCK BAJO (< 5 UNIDADES) ===");
        boolean hayAlertas = false;
        for (int i = 0; i < ventas.length; i++) { // 4 frutas
            for (int j = 0; j < ventas[i].length; j++) { // 5 dias
                if (ventas[i][j] < 5) {
                    System.out.println("ALERTA: " + frutas[i] + " vendio solo " + 
                                       ventas[i][j] + " unidades el dia " + dias[j] + ".");
                    hayAlertas = true;
                }
            }
        }
        if (!hayAlertas) {
            System.out.println("No se registraron ventas menores a 5 unidades.");
        }
    }
}