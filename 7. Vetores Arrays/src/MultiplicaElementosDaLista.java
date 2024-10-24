import java.util.Scanner;
public class MultiplicaElementosDaLista {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System. in);

        int[] numerosEntrada = new int[5];
        int[] numerosMultiplicadosPorTres = new int[5];

        for (int i = 0; i < numerosEntrada.length; i++) {
            
            System.out.println("Digite o " + (i + 1) + "° Número:");
            numerosEntrada[i] = input.nextInt();

        }

        for (int i = 0; i < numerosMultiplicadosPorTres.length; i++) {
            
            numerosMultiplicadosPorTres[i] = numerosEntrada[i] * 3;

        }

        for (int i = 0; i < numerosMultiplicadosPorTres.length; i++) {
         
            System.out.println((i + 1) + "° Número: " + numerosMultiplicadosPorTres[i]);

        }

        input.close();

    }
    
}
