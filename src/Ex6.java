import java.util.Scanner;

public class Ex6 {

    public static void comprobarPosicion() {
        Scanner leer = new Scanner(System.in);
        int CoorX = 0;
        int CoorY = 0;
        int Direccion = 0;
        char [] sopa = { 'S','O','P','A' };
        char [][] SopaLetras={
                {'C','A','S','A','A','A','A','A','A','A'},
                {'A','A','A','B','A','N','R','A','S','A'},
                {'C','A','L','A','B','A','Z','A','C','A'},
                {'A','A','A','C','A','A','A','A','O','R'},
                {'A','A','S','O','P','A','S','O','A','O'},//x,y 2-4
                {'R','E','C','E','T','A','A','A','A','P'},
                {'A','A','A','A','A','A','A','S','A','A'},//X,Y 8 - 6
                {'P','E','R','C','H','E','R','O','A','A'},
                {'A','A','A','A','A','A','A','P','A','A'},
                {'Z','A','P','A','T','O','A','A','A','A'},
        };

        System.out.println("La palabra a buscar será SOPA");
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
        System.out.println("Diagonal = 5");
        Direccion=leer.nextInt();

        //System.out.println("Mostrar " + SopaLetras[CoorY][CoorX]); // Imprimir

        for (int i = CoorX; i < SopaLetras.length; i++) {
            for (int j = 0; j < SopaLetras[i].length; j++) {
                System.out.print(" " + SopaLetras[i][j]);
            }
            System.out.println(" ");
        }// Mostrar Sopa de Letras


        char [] validar = new char[sopa.length];
        int flag = 0;

        switch (Direccion){

            case 1: for (int i = 0; i < sopa.length; i++) {
                System.out.print(SopaLetras[CoorY][CoorX+i]);
                validar[i] = SopaLetras[CoorY][CoorX+i];//Derecha
            };
                break;
            case 2: for (int i = 0; i < sopa.length; i++) {
                System.out.print(SopaLetras[CoorY][CoorX-i]);
                validar[i] = SopaLetras[CoorY][CoorX-i];//Izquierda

            };
                break;
            case 3: for (int i = 0; i < sopa.length; i++) {
                System.out.print(SopaLetras[CoorY+i][CoorX]);
                validar[i] = SopaLetras[CoorY+i][CoorX];//Arriba
            };
                break;
            case 4: for (int i = 0; i < sopa.length; i++) {
                System.out.print(SopaLetras[CoorY-i][CoorX]);
                validar[i] = SopaLetras[CoorY-i][CoorX];//Abajo

            };
                break;
            default:
                System.out.println("Direccion no implementada");
                break;

        }



        //Comprobacion Correcto o Incorrecto
        System.out.println(" ");


        for (int i = 0; i < sopa.length; i++) {
            if (validar[i] != sopa[i]){
                System.out.println("Incorrecto");
                break;
            }
            if(validar[i] == sopa[i]) {
                flag+=1;
            }
        }
        if (flag == sopa.length){
            System.out.println("Correcto");
        }

    }
}
