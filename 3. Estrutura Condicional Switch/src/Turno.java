import java.util.Scanner;

public class Turno {
    
    public static void main(String[] args){
        
        Scanner imput = new Scanner(System. in);
        
        System.out.println("Qual periodo você estuda Escolha uma opção");
        System.out.println("==========Menu de Opções==========");
        System.out.println("M - Matutino");
        System.out.println("V - Vespertino");
        System.out.println("N - Noturno");
        System.out.println("==================================");
        String periodoOpcao = imput.nextLine();
        
        switch (periodoOpcao){
            
            case "M":
                System.out.println("Bom dia!");
                break;
            case "V":
                System.out.println("Boa tarde!");
                break;
            case "N":
                System.out.println("Boa noite!");
                break;
            default:
                System.out.println("Insira um periodo válido");
                break;
            
        }
        
        imput.close();
        
    }

}
