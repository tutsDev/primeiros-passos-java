import java.util.Scanner;
public class RetornaMaximo {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System. in);

        int numEntrada1, numEntrada2;
        System.out.println("Digite o primeiro número:");
        numEntrada1 = input.nextInt();
        System.out.println("Digite o segundo número:");
        numEntrada2 = input.nextInt();

        int maiorNumero = encontrarMax(numEntrada1, numEntrada2);
        System.out.println("O maior é: " + maiorNumero);

        input.close();

    }

    public static int encontrarMax(int n1, int n2){

        if(n1 > n2){
            return n1;
        } else{
            return n2;
        }
        

    }

}
