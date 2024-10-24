import java.util.Scanner;

public class AumentoSalario {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System. in);
        
        System.out.println("Qual seu plano de trabalho? Escolha uma opção");
        System.out.println("==========Menu de Opções==========");
        System.out.println("A - 10%");
        System.out.println("B - 15%");
        System.out.println("C - 20%");
        System.out.println("==================================");
        String planoTrabalho = input.nextLine();
        
        System.out.println("Insira seu salário atual");
        double salarioAtual = input.nextDouble();
        
        switch (planoTrabalho){
            
            case "A":
                double aumentoDez = (salarioAtual * 0.10) + salarioAtual;
                System.out.println("Seu novo salário é de R$" + aumentoDez);
                break;
            case "B":
                double aumentoQuinze = (salarioAtual * 0.15) + salarioAtual;
                System.out.println("Seu novo salário é de R$" + aumentoQuinze);
                break;
            case "C":
                double aumentoVinte = (salarioAtual * 0.20) + salarioAtual;
                System.out.println("Seu novo salário é de R$" + aumentoVinte);
                break;
            default:
                System.out.println("Insira um plano válido");
                break;
            
        }
        
        input.close();
        
    }

}
