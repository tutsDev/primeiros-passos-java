import java.util.Scanner;

public class Intervalo{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System. in);
        
        System.out.println("Insira um número:");
        int numero = input.nextInt();
        
        if (numero >= 50 && numero <= 100){
            System.out.println("O número " + numero + " está no intervalo");
        } else {
            System.out.println("O número " + numero + " não está no intervalo");
        }
        
        input.close();
        
    }
}