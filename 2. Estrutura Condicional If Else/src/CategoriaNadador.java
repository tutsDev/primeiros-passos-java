import java.util.Scanner;

public class CategoriaNadador{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System. in);
        
        System.out.println("Quatos anos você tem?");
        int idade = input.nextInt();
        
        if (idade >= 18){
            System.out.println("Sua categoria é Sênior");
        } else if (idade >= 14 && idade < 18){
            System.out.println("Sua categoria é Juvenil B");
        } else if (idade >= 11 && idade < 14){
            System.out.println("Sua categoria é Juvenil A");
        } else if (idade >= 8 && idade < 11){
            System.out.println("Sua categoria é Infantil B");
        } else if (idade >= 5 && idade < 8){
            System.out.println("Sua categoria é Infantil A");
        } else {
            System.out.println("Você não está em nenhuma categoria :(");
        }
    
        input.close();
        
    }
}