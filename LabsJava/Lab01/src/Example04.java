//Mensaje desde la portátil de mi casa... probando github
import java.util.Scanner;

public class Example04 {
    public static void main(String[] args) {
        //Inicializar variable
        int edad;

        //Ingreso de datos
        Scanner scanner = new Scanner(System.in);

        //Texto para que se ingrese edad
        System.out.println("Ingrese la edad de la persona: ");

        //Pedido de edad por teclado
        edad = scanner.nextInt();

        if (edad >=18){
            System.out.println("Es mayor de edad");
        }
        else {
            System.out.println("Es menor de edad");
        }
    }
}
