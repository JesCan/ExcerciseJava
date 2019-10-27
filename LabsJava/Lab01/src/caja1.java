public class caja1 {
    public static void main(String[] args) {
        Caja caja1 = new Caja ();

        caja1.alto = 10;
        caja1.ancho = 10;
        caja1.largo = 10;

        caja1.volumen();

        Caja caja2 = new Caja();

        caja2.alto = 5;
        caja2.largo = 5;
        caja2.ancho = 5;

        caja2.volumen();
    }
}
