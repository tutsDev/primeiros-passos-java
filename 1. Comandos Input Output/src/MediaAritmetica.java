import java.util.Scanner;

public class MediaAritmetica {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System. in);
        
        System.out.println("Insira a primeira nota:");
        double nota1 = input.nextDouble();
        
        System.out.println("Insira a segunda nota:");
        double nota2 = input.nextDouble();
        
        System.out.println("Insira a terceira nota:");
        double nota3 = input.nextDouble();
        
        double mediaAritmetica = (nota1 + nota2 + nota3) / 3;
        
        System.out.println("A média do aluno é de: " + mediaAritmetica);
        
        input.close();
        
    }

}