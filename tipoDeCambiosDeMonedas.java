package Tarea1CambioDeMoneda;
import java.util.Scanner;
public class tipoDeCambiosDeMonedas {
    static Scanner entrada = new Scanner(System.in);

    public static final String EUROS = "euros";

    public static final String DOLARES = "dolares";

    public static void main(String[] args) {

        double bolivianos = introducirBolivianos();

        String moneda = introducirMoneda();

        double cambio = cambiarMoneda(moneda, bolivianos);

        imprimir(cambio);

    }

    public static double introducirBolivianos() {

        System.out.print("Introduce una cantidad de bolivianos: ");

        double euros = entrada.nextDouble();

        entrada.nextLine();

        return euros;

    }

    public static String introducirMoneda() {

        String moneda;

        System.out.print("Introduce el tipo de moneda: ");

        moneda = entrada.nextLine();

        switch (moneda.toLowerCase()) {

            case EUROS:

            case DOLARES:

                moneda = moneda.toLowerCase();

                break;

            default:

                moneda = null;

                System.out.println("Error, las opciones válidas son: " + EUROS + " y " + DOLARES );

        }

        if (moneda == null) {

            moneda = introducirMoneda();

        }

        System.out.println("La moneda introducida es " + moneda);

        return moneda;

    }

    public static double cambiarMoneda(String moneda, double bolivianos) {

        double cambio = 0.0;

        switch (moneda) {

            case EUROS:

                cambio = bolivianos * 7.28;

                break;

            case DOLARES:

                cambio = bolivianos * 6.88;

                break;

        }

        return cambio;

    }

    public static void imprimir(double cambio) {

        System.out.println("El resultado de la conversión es " + String.format("%.2f", cambio));

    }
}
