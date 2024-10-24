import java.util.Scanner;

public class Emprestimo{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System. in);
        
        System.out.println("Insira o seu salário:");
        double salarioBruto = input.nextDouble();
        
        System.out.println("Insira o valor da prestação desejada:");
        double prestacaoDesejada = input.nextDouble();
        
        double porcentagemSalario = salarioBruto * 0.30;
        
        boolean verificaPrestacao = porcentagemSalario >= prestacaoDesejada;
        
        if (verificaPrestacao == true) {
            System.out.println("O emprestimo será concedido");
        } else {
            System.out.println("O emprestimo não será concedido");
        }

        input.close();
    }
}