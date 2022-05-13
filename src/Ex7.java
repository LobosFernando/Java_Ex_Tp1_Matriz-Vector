public class Ex7 {

    public static void mostrarSopaDeLetras(){
        char [][] SopaLetras = new char[10][10];
        for (int i = 0; i < SopaLetras.length; i++) {
            for (int j = 0; j < SopaLetras[i].length; j++) {
                SopaLetras[i][j] = (char) Rng.Rng65_90() ;
            }
        }
        for (int i = 0; i < SopaLetras.length; i++) {
            for (int j = 0; j < SopaLetras[i].length; j++) {
                System.out.print(" " + SopaLetras[i][j]);
            }
            System.out.println("");
        }

    }
}
