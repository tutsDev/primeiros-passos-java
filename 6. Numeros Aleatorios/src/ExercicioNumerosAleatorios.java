import java.util.Random;
public class ExercicioNumerosAleatorios {
    public static void main(String[] args) {
        
        Random random = new Random();

        int [] numerosAleatorios = new int[10];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            
            numerosAleatorios[i] = random.nextInt(9 + 1);

        }

        for (int i = 0; i < numerosAleatorios.length; i++) {

            System.out.println(numerosAleatorios[i]);

        }
    }

}
