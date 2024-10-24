import java.util.Scanner;

public class ProdutoDeDoisNumeros {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System. in);
        
        System.out.println("Insira o primeiro número:");
        int num1 = input.nextInt();
        
        System.out.println("Insira o segundo número:");
        int num2 = input.nextInt();
        
        double produtoNum = num1 * num2;
        
        System.out.println("O produto dos dois números é: " + produtoNum);
        
        input.close();
        
    }

}