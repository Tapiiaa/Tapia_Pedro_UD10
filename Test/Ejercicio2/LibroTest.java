package Ejercicio2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
class LibroTest {

    @Test
    void testAgregarLibrosExitosamente() {
        Libro libro = new Libro();
        assertDoesNotThrow(() -> libro.agregarLibros(1));
    }







    @Test
    void testQuitarLibrosExitosamente() throws ExcepcionStockDesbordado {
        Libro libro = new Libro();
        libro.agregarLibros(5);
        assertDoesNotThrow(() -> libro.quitarLibros(3));
    }



    @Test
    void testConsultarStock() throws ExcepcionStockDesbordado {
        Libro libro = new Libro();
        libro.agregarLibros(5);
        libro.quitarLibros(2);
        assertEquals(3, libro.consultarStock());
    }
}
