import java.util.Scanner;

public class Example02 {
    public static void main(String[] args) {
        // Leer datos ingresados por teclado
        Scanner scanner = new Scanner(System.in);

        //Mensaje al usuario//
        System.out.println("Ingrese su nombre: ");

        //Leer un valor ingresado por teclado
        String nombre = scanner.nextLine();

        // Monstramos un mensaje con el valor ingresado
        System.out.println("Hola mundo: " + nombre);
    }
}
