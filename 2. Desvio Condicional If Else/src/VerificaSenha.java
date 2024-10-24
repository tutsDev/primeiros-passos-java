/*
Faça um algoritmo que verifique a validade de uma senha fornecida
pelo usuário.
- Sabendo q a senha é R10p5
    Imprima a mensagem de "Acesso Concedido" ou "Acesso Negado".
*/

import java.util.Scanner;

public class VerificaSenha{
    
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