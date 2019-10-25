import java.util.Scanner;

public class Example07 {
    public static void main(String[] args) {
        //Inicializar números
        int numero;
        int i;

        //Texto para ingresar número
        System.out.println("Ingrese número: ");

        //Ingreso de número por teclado
        Scanner scanner = new Scanner(System.in);
        numero = scanner.nextInt();

        //Bucle para imprimir número
        for (i = 1; i<=numero; i++){
            System.out.println(i);
        }

    }
}
