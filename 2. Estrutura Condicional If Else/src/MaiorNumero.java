import java.util.Scanner;

public class MaiorNumero{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System. in);
        
        System.out.println("Insira o primeiro número:");
        int num1 = input.nextInt();
        
        System.out.println("Insira o segudo número:");
        int num2 = input.nextInt();
        
        System.out.println("Insira o terceiro número:");
        int num3 = input.nextInt();
        
        if (num1 == num2 && num1 == num3){
            System.out.println("Os números são iguais.");
        } else if (num1 > num2 && num1 > num3) {
            System.out.println("O maior número é: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("O maior número é: " + num2);
        } else {
            System.out.println("O maior número é: " + num3);
        } 

        input.close();
    }
}