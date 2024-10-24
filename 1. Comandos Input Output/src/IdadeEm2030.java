import java.util.Scanner;

public class IdadeEm2030 {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System. in);
        
        int anoAtual = 2024;
        
        System.out.println("Insira o ano em que você nasceu:");
        int anoNascimento = input.nextInt();
        
        int idadeAtual = anoAtual - anoNascimento;
        int idadeFutura = 2030 - anoNascimento;
        
        System.out.println("Hoje você tem " + idadeAtual + " anos e em 2030, você terá " + idadeFutura + " anos.");
        
        input.close();
    }

}