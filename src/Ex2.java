public class Ex2 {




    public static char[][] SopaLetras(int Fila, int Colum, int max90, int min65) {

        char [][] SopaDeLetras = new char[Fila][Colum];

        int variable = 65;

        for (int i = 0; i < SopaDeLetras.length; i++) {
            for (int j = 0; j < SopaDeLetras[i].length; j++) {
                SopaDeLetras[i][j] = (char) Rng.Rng65_90() ;
            }
        }
        return SopaDeLetras;
    }
}
