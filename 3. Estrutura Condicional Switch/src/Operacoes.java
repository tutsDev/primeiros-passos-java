import java.util.Scanner;

public class Operacoes {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System. in);
        
        System.out.println("Qual operação deseja realizar? Escolha uma opção");
        System.out.println("==========Menu de Opções==========");
        System.out.println("M - Média entre dois números");
        System.out.println("S - Diferença entre os dois números");
        System.out.println("P - Produto dos dois números");
        System.out.println("D - Divisão dos primeiro pelo segundo número");
        System.out.println("==================================");
        String opcaoOperacao = input.nextLine();
        
        System.out.println("Insira o primeiro número para operação");
        double num1 = input.nextDouble();
        System.out.println("Insira o segundo número para operação");
        double num2 = input.nextDouble();
        
        switch (opcaoOperacao){
            
            case "M":
                double media = (num1 + num2) / 2;
                System.out.println("A média dos números é: " + media);
                break;
            case "S":
                double diferenca = num1 - num2;
                System.out.println("A diferença dos números é de: " + diferenca);
                break;
            case "P":
                double produto = num1 * num2;
                System.out.println("O produto dos números é: " + produto);
                break;
            case "D":
                double divisao = num1 / num2;
                System.out.println("A divisão do primeiro pelo segndo é: " + divisao);
                break;
            default:
                System.out.println("Insira uma operação válida");
                break;
            
        }
        
        input.close();
        
    }

}
