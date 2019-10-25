import java.util.Scanner;

public class Example06 {
    public static void main(String[] args) {
        //Inicializar variables
        int numero;
        int i = 1;

        //Pedir número por teclado
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        numero = scanner.nextInt();

        //Hacer recorrido para obtener números
        while (i<=numero){
            System.out.println(i);
            i++;
        }
    }
}
