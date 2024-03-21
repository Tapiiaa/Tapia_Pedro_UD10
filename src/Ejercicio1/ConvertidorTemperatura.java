package Ejercicio1;
import java.util.Scanner;
public class ConvertidorTemperatura {
    double numero;
    double resultado;
    Scanner scanner = new Scanner(System.in);

    public void metodo1() throws Exception {
        System.out.println("Ingrese el número a convertir: ");
        numero = scanner.nextDouble();
        System.out.println("Ingrese la unidad de medida: ");
        String unidad = scanner.next();
        if (unidad.equals("C")) {
            resultado = (numero * 9/5) + 32;
            // Si el resultado pasa del cero absoluto, se lanza una excepción
            if (resultado < -459.67) {
                throw new Exception("El resultado no puede ser menor al cero absoluto");
            }
            System.out.println("El resultado es: " + resultado + " F");
        } else if (unidad.equals("F")) {
            resultado = (numero - 32) * 5/9;
            // Si el resultado pasa del cero absoluto, se lanza una excepción
            if (resultado < -273.15) {
                throw new Exception("El resultado no puede ser menor al cero absoluto");
            }
            System.out.println("El resultado es: " + resultado + " C");
        } else {
            throw new Exception("Unidad de medida no válida");
        }
    }

    private double grados(double numero, String unidad) {
        if (unidad.equals("C")) {
            return (numero * 9/5) + 32;
        } else {
            return (numero - 32) * 5/9;
        }
    }
}
