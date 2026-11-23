import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== CALCULADORA (ENTRADAS DE 5 DIGITOS: [-99999..99999]) ===");
            System.out.println("Operaciones permitidas:");
            System.out.println("  1 -> Suma (+)");
            System.out.println("  2 -> Resta (-)");
            System.out.println("  3 -> Multiplicacion (*)");
            System.out.println("  4 -> Potencia (^)");

            int a = leerEnteroEnRango(scanner, "Introduce el primer numero entero [-99999..99999]: ");
            int opcion = leerOperacion(scanner);
            int b = leerEnteroEnRango(scanner, "Introduce el segundo numero entero [-99999..99999]: ");

            BigInteger resultado = Operaciones.calcular(a, b, opcion);
            System.out.println("Resultado: " + resultado);
        } catch (IllegalArgumentException | ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static int leerEnteroEnRango(Scanner scanner, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            try {
                int valor = scanner.nextInt();
                if (valor < Operaciones.MIN_ENTRADA || valor > Operaciones.MAX_ENTRADA) {
                    System.out.println(
                        "Fuera de rango. Debe estar entre " + Operaciones.MIN_ENTRADA + " y " + Operaciones.MAX_ENTRADA + "."
                    );
                } else {
                    return valor;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada no valida. Introduce un numero entero.");
                scanner.next();
            }
        }
    }

    private static int leerOperacion(Scanner scanner) {
        while (true) {
            System.out.print("Elige la operacion (1: suma, 2: resta, 3: multiplicacion, 4: potencia): ");
            try {
                int op = scanner.nextInt();
                if (op >= 1 && op <= 4) {
                    return op;
                }
                System.out.println("Operacion no permitida. Solo 1, 2, 3 o 4.");
            } catch (InputMismatchException e) {
                System.out.println("Entrada no valida. Introduce 1, 2, 3 o 4.");
                scanner.next();
            }
        }
    }
}