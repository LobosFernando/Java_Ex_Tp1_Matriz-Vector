import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //RNG TEST
        int mostrar = 0;
        for (int i = 0; i < 20; i++) {
            mostrar = Rng.Rng3_9();
            //System.out.println(mostrar);
        }
        //Ejercicio_1
        System.out.println("Ejercicio_1");
        char [] palabras = Ex1.Palabra(Rng.Rng3_9(),Rng.MAX_90,Rng.MIN_65);
        for (char letra: palabras) {
            System.out.print(" " +letra);
        }
        System.out.println("\n-------------------------------");
        Thread.sleep(2000);
        //Ejercicio_2
        System.out.println("Ejercicio_2");
        char [][] sopaDLetras = Ex2.SopaLetras(Rng.Rng3_9(),Rng.Rng3_9(),Rng.MAX_90,Rng.MIN_65);
        int ContFilas = 0;
        int ContColum = 0;
        for (char[] sopaLetraX : sopaDLetras) {//Ambos deben ser char!!!!!!!!!!!!!!!!!!!
            ContColum = 0;
            for (char Y:sopaLetraX) { //Ambos deben ser char!!!!!!!!!!!!!!!!!!!
                System.out.print(" " + Y);
                ContColum++;
            }
            ContFilas++;
            System.out.println(" ");
        }
        System.out.println("-------------------------------");
        Thread.sleep(2000);
        //Ejercicio_3
        System.out.println("Ejercicio_3");
        System.out.println("Utilizando el Ejercicio_2 generé un contador para cada fila y columna");
        System.out.println("Filas: " + ContFilas);
        System.out.println("Columnas: " + ContColum);
        System.out.println("-------------------------------");
        Thread.sleep(2000);
        //Ejercicio_4
        System.out.println("Ejercicio_4");
        Scanner leer = new Scanner(System.in);

        //Ejercicio_5
        System.out.println("Ejercicio_5");
        int CoorX = 0;
        int CoorY = 0;
        System.out.println("Ingrese La coordenada X de la Sopa de Letras");
        CoorX = leer.nextInt();
        System.out.println("Ingrese la coordenada Y de la Sopa de Letras");
        CoorY = leer.nextInt();
        System.out.println("Comprobando........");
        if (!Ex5.comprobar(CoorX, CoorY)){
            System.out.println("Coordenadas Correctas");
        }else {
            System.out.println("Coordenadas Incorrectas");
        }
        System.out.println("-------------------------------");
        Thread.sleep(2000);
        //Ejercicio_6
        System.out.println("Ejercicio_6");
        Ex6.comprobarPosicion();
        //Ejercicio_7
        System.out.println("Ejercicio_7");
        Ex7.mostrarSopaDeLetras();
        System.out.println("-------------------------------");
        //Ejercicio_8
        System.out.println("Ejercicio_8");





       //int valor = Ex1.func();
        //System.out.println(valor);

       // String nuevo = Input.Ingreso();
        //System.out.println(nuevo);
        //userName = myObj.nextLine();

        //int randomNum = (int)(Math.random() * (91 - 65 + 1) +65);  // generar random mas complicado// Sino clase Random
        //System.out.println(randomNum);



    }


}