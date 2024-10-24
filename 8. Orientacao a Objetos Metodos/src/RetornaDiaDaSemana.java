import java.util.Scanner;
public class RetornaDiaDaSemana {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System. in);

        System.out.println("Digite um número de 1 - 7: ");
        int diaDaSemanaEntrada = input.nextInt();

        exibeDiaDaSemana(diaDaSemanaEntrada);

        input.close();
        
    }

    public static void exibeDiaDaSemana(int n1){

        switch (n1) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
        
            default:
                System.out.println("Valor Invalido");
                break;
        }

    }

}
