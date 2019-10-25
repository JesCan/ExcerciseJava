import java.util.Scanner;

public class Example05 {
    public static void main(String[] args) {
        String letra;
        String nivel;

        System.out.println("Ingrese letra: ");
        Scanner scanner = new Scanner(System.in);
        letra = scanner.nextLine();
        switch (letra){
            case "I":
                nivel = "Inicial";
                break;
            case "P":
                nivel = "Primaria";
                break;
            case "S":
                nivel = "Secundaria";
                break;
            default:
                nivel = "La letra ingresada es incorrecta";
        }
        System.out.println("La letra ingresada es " + letra);

    }
}
