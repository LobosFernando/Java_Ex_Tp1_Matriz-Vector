public class Ex1 {

    public static char[] Palabra (int rango, int max, int min){
        char [] palabra = new char[rango];
        for (int i = 0; i < palabra.length; i++) {
            palabra[i]=(char) Rng.RngInput(max,min);
        }
        return palabra;
    }


}
