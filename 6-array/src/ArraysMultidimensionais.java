import java.util.Random;

public class ArraysMultidimensionais {
    public static void main(String[] args) {

        System.out.println("INÍCIO - ARRAY UNIDIMENSIONAL");

        int[] array = new int[5];
        PreencheArray(array);
        ImprimeArray(array);

        System.out.println("FIM - ARRAY UNIDIMENSIONAL");
        System.out.println();
        System.out.println("INÍCIO - ARRAY BIDIMENSIONAL");

        int[][] arrayBi = new int[2][2];
        PreencheBi(arrayBi);
        ImprimeBi(arrayBi);

        System.out.println("FIM - ARRAY BIDIMENSIONAL");
        System.out.println();
        System.out.println("INÍCIO - ARRAY TRIDIMENSIONAL");
        
        int[][][] arrayTri = new int[3][3][3];
        PreencheTri(arrayTri);
        ImprimeTri(arrayTri);

        System.out.println("FIM - ARRAY TRIDIMENSIONAL");
        System.out.println();
        System.out.println("INÍCIO - ARRAY QUADRIDIMENSIONAL");

        int[][][][] arrayQuadri = new int[4][4][4][4];
        PreencheQuadri(arrayQuadri);
        ImprimeQuadri(arrayQuadri);

        System.out.println("FIM - ARRAY QUADRIDIMENSIONAL");
    }

    public static void PreencheArray(int[] x){
        Random random = new Random();
        for (int i = 0; i < x.length; i++) {
            x[i] = random.nextInt(100);
        }
    }

    public static void ImprimeArray(int[] x){
        for (int i = 0; i < x.length; i++) {
            System.out.printf("Array1 - Posição %d = %d \n", i, x[i]);
        }
    }

    public static void PreencheBi(int[][] x){
        Random random = new Random();
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = random.nextInt(100);
            }
        }
    }

    public static void ImprimeBi(int[][] x){
        for (int i = 0; i < x.length; i++) {
            System.out.printf("Array1 - Volta %d\n", i);
            for (int j = 0; j < x.length; j++) {
                System.out.printf(" Array2 - Posição %d = %d \n", j, x[i][j]);
            }
        }
    }

    public static void PreencheTri(int[][][] x){
        Random random = new Random();
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                for (int k = 0; k < x[i][j].length; k++) {
                    x[i][j][k] = random.nextInt(100);
                }
            }
        }
    }

    public static void ImprimeTri(int[][][] x){
        for (int i = 0; i < x.length; i++) {
            System.out.printf("Array1 - Volta %d\n", i);
            for (int j = 0; j < x.length; j++) {
                System.out.printf(" Array2 - Volta %d\n", j);
                for (int k = 0; k < x.length; k++) {
                    System.out.printf("  Array3 - Posição %d = %d \n", k, x[i][j][k]);
                }
            }
        }
    }

    public static void PreencheQuadri(int[][][][] x){
        Random random = new Random();
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                for (int k = 0; k < x[i][j].length; k++) {
                    for (int l = 0; l < x.length; l++) {
                        x[i][j][k][l] = random.nextInt(100);
                    }
                }
            }
        }
    }

    public static void ImprimeQuadri(int[][][][] x){
        for (int i = 0; i < x.length; i++) {
            System.out.printf("Array1 - Volta %d\n", i);
            for (int j = 0; j < x.length; j++) {
                System.out.printf("   Array2 - Volta %d\n", j);
                for (int k = 0; k < x.length; k++) {
                    System.out.printf("      Array3 - Volta %d\n", k);
                    for (int l = 0; l < x.length; l++) {
                        System.out.printf("         Array4 - Posição %d = %d \n", l, x[i][j][k][l]);
                    }
                }
            }
        }
    }
}