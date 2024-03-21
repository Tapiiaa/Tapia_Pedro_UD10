package Ejercicio1;

public class Menu {
    public static void main(String[] args) {
        ConvertidorTemperatura convertidor = new ConvertidorTemperatura();
        try {
            convertidor.metodo1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
