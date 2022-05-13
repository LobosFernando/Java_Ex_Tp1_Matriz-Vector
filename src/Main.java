public class Main {
    public static void main(String[] args) {
        //RNG TEST
        int mostrar = 0;
        for (int i = 0; i < 20; i++) {
            mostrar = Rng.Rng3_9();
            //System.out.println(mostrar);
        }
        //Ejercicio_1
        //Escribir el código de un método que devuelva una “palabra” (un vector de caracteres).
        //El método debe generar un vector de caracteres aleatorios, recibiendo como argumentos: la longitud del vector
        //y el rango de valores permitidos (rango al que deben pertenecer los caracteres aleatorios que se elijan como
        //valores).
        char [] palabras = Ex1.Palabra(Rng.Rng3_9(),Rng.MAX_90,Rng.MIN_65);
        for (char letra: palabras) {
            System.out.print(letra + " ");
        }
        System.out.println("\n-------------------------------");
        //Ejercicio_2
        char [][] sopaLetras =Ex2.SopaLetras(Rng.Rng3_9(),Rng.Rng3_9(),Rng.MAX_90,Rng.MIN_65);

        for (int i = 0; i < sopaLetras.length ; i++) {
            for (int j = 0; j < sopaLetras.length; j++) {
                System.out.println(sopaLetras[i][j]);
            }
        }



       //int valor = Ex1.func();
        //System.out.println(valor);

       // String nuevo = Input.Ingreso();
        //System.out.println(nuevo);
        //userName = myObj.nextLine();

        //int randomNum = (int)(Math.random() * (91 - 65 + 1) +65);  // generar random mas complicado// Sino clase Random
        //System.out.println(randomNum);



    }


}