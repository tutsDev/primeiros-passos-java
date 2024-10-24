import java.util.Scanner;
public class SubitraiElementosDeDuasListas {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System. in);
        
        System.out.println("Quantas subtrações deseja realizar?");
        int tamanhoDaLista = input.nextInt();

        int[] primeiroNumeroDaSubtracao = new int[tamanhoDaLista];
        int[] segundoNumeroDaSubtracao = new int[tamanhoDaLista];
        int[] resultadoSubtracao = new int[tamanhoDaLista];

        for (int i = 0; i < primeiroNumeroDaSubtracao.length; i++) {
            
            System.out.println("Digite o primeiro número para " + (i + 1) +"° Subtração:" );
            primeiroNumeroDaSubtracao[i] = input.nextInt();

            System.out.println("Digite o segundo número para " + (i + 1) +"° Subtração:" );
            segundoNumeroDaSubtracao[i] = input.nextInt();

        }

        for (int i = 0; i < resultadoSubtracao.length; i++) {

            resultadoSubtracao[i] = primeiroNumeroDaSubtracao[i] - segundoNumeroDaSubtracao[i];
            System.out.println(primeiroNumeroDaSubtracao[i] + " - " + segundoNumeroDaSubtracao[i] + " = " + resultadoSubtracao[i]);

        }

        input.close();

    }

}

