import java.math.BigInteger;

public class Operaciones {

    public static final int MIN_ENTRADA = -99999;
    public static final int MAX_ENTRADA = 99999;

    public static void validarRangoEntrada(int valor, String nombre) {
        if (valor < MIN_ENTRADA || valor > MAX_ENTRADA) {
            throw new IllegalArgumentException(
                nombre + " (" + valor + ") fuera del rango permitido [" + MIN_ENTRADA + ".." + MAX_ENTRADA + "]."
            );
        }
    }

    public static BigInteger calcular(int a, int b, int opcion) {
        validarRangoEntrada(a, "Primer operando");
        validarRangoEntrada(b, "Segundo operando");

        BigInteger bigA = BigInteger.valueOf(a);
        BigInteger bigB = BigInteger.valueOf(b);

        return switch (opcion) {
            case 1 -> bigA.add(bigB);
            case 2 -> bigA.subtract(bigB);
            case 3 -> bigA.multiply(bigB);
            case 4 -> potencia(bigA, b);
            default -> throw new IllegalArgumentException("Operacion no permitida.");
        };
    }

    private static BigInteger potencia(BigInteger base, int exponente) {
        if (base.equals(BigInteger.ZERO) && exponente < 0) {
            throw new ArithmeticException("0 elevado a un exponente negativo no esta definido.");
        }
        if (exponente < 0) {
            if (base.equals(BigInteger.ONE)) {
                return BigInteger.ONE;
            }
            if (base.equals(BigInteger.valueOf(-1))) {
                return (exponente % 2 == 0) ? BigInteger.ONE : BigInteger.valueOf(-1);
            }
            throw new IllegalArgumentException(
                "Para entradas enteras, un exponente negativo distinto de 1 o -1 no produce un entero exacto."
            );
        }
        return base.pow(exponente);
    }
}