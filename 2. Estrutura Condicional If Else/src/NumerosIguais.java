import java.util.Scanner;

public class NumerosIguais{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System. in);
        
        System.out.println("Insira o primeiro número:");
        int primeiroNumero = input.nextInt();
        
        System.out.println("Insira o segundo número:");
        int segundoNumero = input.nextInt();
        
        if (primeiroNumero == segundoNumero) {
            System.out.println("Os números são iguais.");
        } else {
            System.out.println("Os números são diferentes, a diferença deles é de: " + (primeiroNumero - segundoNumero));   
        }
        
        input.close();
    }
}