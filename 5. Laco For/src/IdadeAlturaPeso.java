import java.util.Scanner;
public class IdadeAlturaPeso {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System. in);

        int i = 0;

        int idade = 0;
        double altura = 0;
        double peso = 0;

        int qtdPessoasIdade50 = 0;
        int qtdPessoasIdade10a20 = 0;
        double acumulaAltura = 0;
        int qtdPessoasPeso40 = 0;

        for (i = 1; i <= 10; i++){

            System.out.println("Insira sua idade da pessoa " + i + ":");
            idade = input.nextInt();

            System.out.println("Agora, insira a altura(ex: 1,70):");
            altura = input.nextDouble();

            System.out.println("Por fim, insira o peso(ex: 75,00):");
            peso = input.nextDouble();

            if (idade > 50){
                qtdPessoasIdade50++;
            }

            if (idade >= 10 && idade <= 20) {
                qtdPessoasIdade10a20++;
                acumulaAltura += altura;
            }

            if (peso < 40) {
                qtdPessoasPeso40++;
            }

        }

        double mediaAltura = acumulaAltura / qtdPessoasIdade10a20;
        double porcentagemPeso = (qtdPessoasPeso40 * 100)/10;

        System.out.println("A quantidade de pessoas com mais de 50 anos é " + qtdPessoasIdade50 + " pessoas");
        System.out.println("A média das alturas das pessoas entre 10 e 20 anos é " + mediaAltura);
        System.out.println("A porcentagem de pessoas com peso inferior a 40Kg é " + porcentagemPeso + "%");

        input.close();

    }
}
