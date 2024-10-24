import java.util.Scanner;
public class SequenciaLimite {
    public static void main(String[] args) {

        Scanner input = new Scanner(System. in);
        
        System.out.println("Insira o limite da sequência:");
        int numEntrada = input.nextInt();
        int i;

        System.out.print("Sequeência: ");
        
        for (i = 1; i <= numEntrada; i++){
            
            System.out.print(i + " ");
        }

        input.close();

    }
}
