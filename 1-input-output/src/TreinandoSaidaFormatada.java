import java.util.Scanner;
public class TreinandoSaidaFormatada {
    public static void main(String[] args) {

        /* Para um bom fincionamento no teste, comente os exercícios 
        que não deseja testar teste um exercício por vez. */

        //EXERCÍCIO 1
        
        Scanner input1 = new Scanner(System. in);

        String nome;
        int idade;
        double altura;

        System.out.print("Digite seu nome: ");
        nome = input1.nextLine();

        System.out.print("Digite sua idade: ");
        idade = input1.nextInt();

        System.out.print("Digite sua altura: ");
        altura = input1.nextDouble();

        System.out.printf("Nome: %-15s\n", nome); //Formate com alinhamento de à esquerda com 15 caracteres.
        System.out.printf("Idade: %03d\n", idade); //Formate para que seja exibidos com largura de três digitos.
        System.out.printf("Altura: %.2f\n", altura); //Formate com duas casas decimais.

        input1.close();

        //EXERCÍCIO 2

        Scanner input2 = new Scanner(System. in);

        String nomeProduto;
        int qtdProduto;
        double precoUnd, precoTotal;

        System.out.print("Digite o nome do produto: ");
        nomeProduto = input2.nextLine();

        System.out.print("Digite a quantidade: ");
        qtdProduto = input2.nextInt();

        System.out.print("Digite o preço unitário: ");
        precoUnd = input2.nextDouble();

        precoTotal = precoUnd * qtdProduto;

        System.out.printf("Produto: %s\n", nomeProduto);
        System.out.printf("Quantidade: %d\n", qtdProduto);
        System.out.printf("Preço unitário: %08.2f\n", precoUnd); //Formate para que seja exibido com largura de 8 digitos.
        System.out.printf("Valor total: R$%.2f\n", precoTotal); //Formate com duas casas decimais.

        input2.close();

        //EXERCÍCIO 3

        Scanner input3 = new Scanner(System. in);

        String nomeAluno;
        double nota1, nota2, nota3, mediaAluno;

        System.out.print("Digite o nome do aluno: ");
        nomeAluno = input3.nextLine();

        System.out.print("Digite a nota 1: ");
        nota1 = input3.nextDouble();

        System.out.print("Digite a nota 2: ");
        nota2 = input3.nextDouble();

        System.out.print("Digite a nota 3: ");
        nota3 = input3.nextDouble();

        mediaAluno = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Aluno: %-20s\n", nomeAluno); //Formate com alinhamento a esquerda de 20 caracteres.
        System.out.printf("Nota 1: %.1f\n", nota1); //Formate todas as notas com apenas uma casa decimal.
        System.out.printf("Nota 2: %.1f\n", nota2);
        System.out.printf("Nota 3: %.1f\n", nota3);
        System.out.printf("Média: %.2f\n", mediaAluno); //Formate a media com duas casas decimais.


        input3.close();

        //EXERCÍCIO 4

        Scanner input4 = new Scanner(System. in);

        double tempCelsius, tempFahrenheit;

        System.out.print("Digite a temperatura em Celsius: ");
        tempCelsius = input4.nextDouble();

        tempFahrenheit = (tempCelsius * (9.0 / 5)) + 32;

        System.out.printf("Temperatura em Celsius: %.1f°C\n", tempCelsius); //Formate para uma casa decimal.
        System.out.printf("Temperatura em Fahrenheit: %.2f°F\n", tempFahrenheit); //Formate para duas casas decimais.

        input4.close();

        //EXERCÍCIO 5

        Scanner input5 = new Scanner(System. in);

        double numero;

        System.out.print("Digite um número: ");
        numero = input5.nextDouble();

        System.out.printf("Número normal: %.2f\n", numero);
        System.out.printf("Número em notação científica: %e\n", numero); //Formate para notação científica.

        input5.close();


    }
    
}
