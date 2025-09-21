public class VentasTienda {
    static String[] meses = {
        "Enero","Febrero","Marzo","Abril","Mayo","Junio",
        "Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"
    };
    static String[] departamentos = {"Ropa","Deportes","Juguetería"};
    static int[][] ventas = new int[12][3];

    // Insertar o actualizar venta
    public static void insertarVenta() {
        int mes = Teclado.readInt("Mes (1-12): ") - 1;
        int depto = Teclado.readInt("Departamento (1=Ropa,2=Deportes,3=Juguetería): ") - 1;
        int valor = Teclado.readInt("Monto de venta: ");
        ventas[mes][depto] = valor;
        System.out.println("Venta registrada: " + meses[mes] + " - " + departamentos[depto] + " = " + valor + "\n");
    }

    // Buscar venta específica
    public static void buscarVenta() {
        int mes = Teclado.readInt("Mes a buscar (1-12): ") - 1;
        int depto = Teclado.readInt("Departamento (1=Ropa,2=Deportes,3=Juguetería): ") - 1;
        System.out.println("Resultado: " + ventas[mes][depto] + " para " + meses[mes] + " - " + departamentos[depto] + "\n");
    }

    // Eliminar venta (poner a 0)
    public static void eliminarVenta() {
        int mes = Teclado.readInt("Mes a eliminar (1-12): ") - 1;
        int depto = Teclado.readInt("Departamento (1=Ropa,2=Deportes,3=Juguetería): ") - 1;
        ventas[mes][depto] = 0;
        System.out.println("Venta eliminada en " + meses[mes] + " - " + departamentos[depto] + "\n");
    }

    // Mostrar tabla completa
    public static void mostrarTabla() {
        System.out.printf("%-12s", "Mes");
        for (String dep : departamentos) {
            System.out.printf("%12s", dep);
        }
        System.out.println();
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < meses.length; i++) {
            System.out.printf("%-12s", meses[i]);
            for (int j = 0; j < departamentos.length; j++) {
                System.out.printf("%12d", ventas[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Insertar venta");
            System.out.println("2. Buscar venta");
            System.out.println("3. Eliminar venta");
            System.out.println("4. Mostrar tabla de ventas");
            System.out.println("5. Salir");
            opcion = Teclado.readInt("Elige una opción: ");

            switch (opcion) {
                case 1:
                    insertarVenta();
                    break;
                case 2:
                    buscarVenta();
                    break;
                case 3:
                    eliminarVenta();
                    break;
                case 4:
                    mostrarTabla();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida\n");
            }
        } while (opcion != 5);
    }
}
