package Ejercicio2;
import java.util.Scanner;
public class SistemaDeControlDeStock {
    // En esta clase se crea un sistema de control de stock que gestione libros en una librería.
    // Se permite agregar libros al stock, quitar libros del stock y consultar la cantidad de libros en stock.

    //Este sistema maneja la cantidad de libros como enteros. El valor debe estar entre -2.147.483.648 y 2.147.483.647

    //Será interactivo, es decir, el usuario eligirá qué acción realizar.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        menu.menu();

    }
}
