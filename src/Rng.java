import java.util.Random;

public class Rng {
    public static final int MAX_90 = 90;
    public static final int MIN_65 = 65;
    public static final int Max_9 = 9;
    public static final int Min_3 = 9;
    static Random rng = new Random();

    public static int Rng65_90(){

        return rng.nextInt((MAX_90- MIN_65 + 1)) + MIN_65;
    }
    public static int Rng3_9(){

        return rng.nextInt((9-3 + 1)) + 3;
    }

    public static int RngInput(int max, int min){

        return rng.nextInt((max-min + 1)) + min;
    }
}
