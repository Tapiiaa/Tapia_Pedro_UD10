package Ejercicio2;
import java.util.Scanner;
import java.util.ArrayList;
public class Menu {
    //Menu para el sistema de control de stock
    //ArrayList para almacenar los libros a continuacion
    ArrayList<Libro> libros = new ArrayList<Libro>();

    public void menu(){

        while(true){
            System.out.println("¿Qué acción desea realizar? (agregar, quitar, consultar, salir)");
            Scanner scanner = new Scanner(System.in);
            String accion = scanner.nextLine();
            if(accion.equals("salir")){
                break;
            }
            System.out.println("Introduce el ISBN del libro: ");
            String isbn = scanner.nextLine();
            System.out.println("Introduce la cantidad de libros: ");
            int cantidad = scanner.nextInt();
            Libro libro = new Libro();
            try{
                if(accion.equals("agregar")){
                    libro.agregarLibros(cantidad);
                    System.out.println("Libro añadido");
                    //Añadir a la lista de libros
                    libros.add(libro);
                    //Esperar 1 segundo para mostrar el siguiente mensaje
                    try{
                        Thread.sleep(1000);
                    }
                    catch(InterruptedException e){
                        System.out.println(e);
                    }
                    System.out.println("Si tiene otra consulta, pulse 1");
                    int consulta = scanner.nextInt();
                    if(consulta == 1){
                        menu();
                    }
                }else if(accion.equals("quitar")){
                    //Si los datos introducidos son correctos, quitar libros
                    libro.quitarLibros(cantidad);
                    //Eliminar de la lista de libros
                    libros.remove(libro);
                    //Si los datos introducidos no son correctos, lanzar una excepción
                    if(cantidad > libro.consultarStock()){
                        throw new ExcepcionStockDesbordado("El stock del libro excede la capacidad de este sistema");
                    }
                    //Si el isbn no coincide con el libro, lanzar una excepción
                    if(!libros.contains(libro)){
                        throw new ExcepcionStockDesbordado("El libro no existe");
                    }
                    //Si no hay libros, imprimir un mensaje
                    if(libros.isEmpty()){
                        System.out.println("No hay libros");
                    }
                    System.out.println("Libro eliminado");
                    //Esperar 1 segundo para mostrar el siguiente mensaje
                    try{
                        Thread.sleep(1000);
                    }
                    catch(InterruptedException e){
                        System.out.println(e);
                    }
                    System.out.println("Si tiene otra consulta, pulse 1");
                    int consulta = scanner.nextInt();
                    if(consulta == 1){
                        menu();
                    }

                }else if(accion.equals("consultar")){
                    libro.consultarStock();
                    //Mostrar la lista de libros
                    for(Libro l : libros){
                        System.out.println("ISBN: " + isbn + " Stock: " + l.consultarStock());
                    }
                    System.out.println("Si tiene otra consulta, pulse 1");
                    int consulta = scanner.nextInt();
                    if(consulta == 1){
                        menu();
                    }
                }else{
                    System.out.println("Acción no válida");
                }
            }catch(ExcepcionStockDesbordado e){
                System.out.println(e.getMessage());
            }
        }
    }
}
