package EjercicioTienda;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    private static final int NUM_TIENDAS = 5;
    private static final int NUM_PRODUCTOS = 10;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // para punto decimal en printf si hiciera falta
        Scanner sc = new Scanner(System.in);

        // Catálogo (id, nombre, precio en céntimos)
        Producto[] catalogo = new Producto[] {
            new Producto(1,  "Mascarillas FFP2 10u",        1299),
            new Producto(2,  "Mascarillas quirúrgicas 50u",  899),
            new Producto(3,  "Guantes nitrilo 100u",        1599),
            new Producto(4,  "Gel hidroalcohólico 100ml",    299),
            new Producto(5,  "Gel hidroalcohólico 500ml",    699),
            new Producto(6,  "Termómetro infrarrojo",       1999),
            new Producto(7,  "Toallitas desinfectantes 80u", 499),
            new Producto(8,  "Pantalla facial",              599),
            new Producto(9,  "Gel hidroalcohólico pocket",   199),
            new Producto(10, "Gel hidroalcohólico 1000ml",  1099)
        };

        for (int i = 1; i <= NUM_TIENDAS; i++) {
            System.out.print("Tienda " + i + ": ");
            String nombreTienda = leerLinea(sc);
            Tienda tienda = new Tienda(nombreTienda);

            while (true) {
                System.out.print("¿Producto (1-10)? (-1 para terminar): ");
                Integer codigo = leerEntero(sc);
                if (codigo == null) {
                    System.out.println("Entrada inválida. Intente de nuevo.");
                    continue;
                }
                if (codigo == -1) break; // pasar a la siguiente tienda

                if (codigo < 1 || codigo > NUM_PRODUCTOS) {
                    System.out.println("Código fuera de rango. Debe ser 1..10 o -1.");
                    continue;
                }

                Producto p = catalogo[codigo - 1];
                System.out.println("Seleccionado: " + p.getNombre());

                System.out.print("Unidades solicitadas: ");
                Integer unidades = leerEntero(sc);
                if (unidades == null || unidades < 0) {
                    System.out.println("Cantidad inválida. Debe ser un entero >= 0.");
                    continue;
                }
                p.addUnidades(unidades);
                System.out.println("Acumulado de \"" + p.getNombre() + "\": " + p.getCantidad() + " uds\n");
            }
            System.out.println("Pedido finalizado para la tienda \"" + tienda.getNombre() + "\".\n");
        }

        // Resumen
        System.out.println("\n======= RESUMEN DEL PEDIDO =======");
        System.out.printf("%-32s %10s %14s%n", "Producto", "Unidades", "Importe parcial");
        System.out.println("--------------------------------------------------------------");
        long totalCent = 0L;
        for (Producto p : catalogo) {
            if (p.getCantidad() > 0) {
                long imp = p.getImporteCent();
                totalCent += imp;
                System.out.printf("%-32s %10d %12s%n",
                        p.getNombre(),
                        p.getCantidad(),
                        formatearEuros(imp));
            }
        }
        System.out.println("--------------------------------------------------------------");
        System.out.printf("%-32s %10s %12s%n", "TOTAL", "", formatearEuros(totalCent));
        System.out.println("==================================");
    }

    // ---------- utilidades de entrada/salida ----------
    private static String leerLinea(Scanner sc) {
        String linea = sc.nextLine();
        while (linea != null && linea.isEmpty()) {
            break;
        }
        return linea == null ? "" : linea;
    }

    private static Integer leerEntero(Scanner sc) {
        String linea = sc.nextLine().trim();
        try {
            return Integer.parseInt(linea);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    private static String formatearEuros(long cent) {
        long euros = cent / 100;
        long resto = Math.abs(cent % 100);
        return euros + "," + (resto < 10 ? "0" + resto : resto) + " €";
    }
}