package Ejercicio2;
import java.lang.Throwable;
public class Libro {
    //Esta clase contiene métodos para añadir y quitar libros del stock, y para consultar la cantidad de libros en stock.
    // Todos toman enteros como argumentos y devuelven enteros.

    private int stock = 0;
    private int stockMaximo = 2147483647;
    private int stockMinimo = -2147483648;

    public int agregarLibros(int cantidad) throws ExcepcionStockDesbordado {
        if (stock + cantidad > stockMaximo) {
            throw new ExcepcionStockDesbordado("El stock del libro excede la capacidad de este sistema");
        }
        stock += cantidad;
        return stock;
    }

    public int quitarLibros(int cantidad) throws ExcepcionStockDesbordado {
        if (stock - cantidad < stockMinimo) {
            throw new ExcepcionStockDesbordado("El stock del libro excede la capacidad de este sistema");
        }
        stock -= cantidad;
        return stock;
    }

    public int consultarStock() {
        return stock;
    }


}
