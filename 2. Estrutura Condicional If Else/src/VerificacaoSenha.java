import java.util.Scanner;

public class VerificacaoSenha{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System. in);
        
        System.out.println("Insira a senha:");
        String senha = input.nextLine();
        
        if (senha.equals("R10p5")){
            System.out.println("Acesso Consedido");
        }  else {
            System.out.println("Acesso Negado");
        }
    
        input.close();
        
    }
}