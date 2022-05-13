import java.util.Scanner;

public class Ex6 {

    public static void comprobarPosicion() {
        Scanner leer = new Scanner(System.in);
        int CoorX = 0;
        int CoorY = 0;
        int Direccion = 0;
        char [][] SopaLetras={
                {'A','A','A','A','A','A','A','A','A','A'},
                {'A','A','A','A','A','A','A','A','A','A'},
                {'A','A','A','A','A','A','A','A','A','A'},
                {'A','A','A','A','A','A','A','A','A','A'},
                {'A','A','A','A','A','A','A','A','A','A'},
                {'A','A','A','A','A','A','A','A','A','A'},
                {'A','A','A','A','A','A','A','A','A','A'},
                {'A','A','A','A','A','A','A','A','A','A'},
                {'A','A','A','A','A','A','A','A','A','A'},
                {'A','A','A','A','A','A','A','A','A','A'},
        };

        System.out.println("Ingrese la Coordenada X");
        CoorX=leer.nextInt();
        System.out.println("Ingrese la Coordenada Y");
        CoorY=leer.nextInt();
        System.out.println("");
        System.out.println("Ingrese la Coordenada Dirección");
        System.out.println("Derecha = 1");
        System.out.println("Izquierda = 2");
        System.out.println("Arriba = 3");
        System.out.println("Abajo = 4");
        Direccion=leer.nextInt();


    }
}
