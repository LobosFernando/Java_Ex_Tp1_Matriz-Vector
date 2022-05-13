public class Ex5 {
    public static boolean comprobar(int coorX, int coorY) {
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

        return (coorX > 10  || coorY > 10 || coorX<0 || coorY<0);
    }
}
