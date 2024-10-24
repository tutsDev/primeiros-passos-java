import java.util.Scanner;
public class RetornaFatorial {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System. in);

        System.out.println("Digite um número para calcular o fatorial:");
        long numEntrada = input.nextInt();

        long fatorialNumEntrada = calculaFatorial(numEntrada);
        System.out.println("O fatorial de " + numEntrada + " é: " + fatorialNumEntrada);

        input.close();

    }

    public static long calculaFatorial(long numParaCalcular){

        long fatorialNumParaCalcular = numParaCalcular;

        for (long i = numParaCalcular - 1; i > 0; i--) {
            
            fatorialNumParaCalcular = fatorialNumParaCalcular * i;

        }

        return fatorialNumParaCalcular;

    }

}
