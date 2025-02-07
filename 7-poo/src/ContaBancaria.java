/*
Crie uma classe Conta que representa uma conta bancária, com atributos titular, numero, saldo.
Adicione métodos para depositar, sacar e exibir o saldo.
No método main, crie uma conta, faça depósitos, saques e exiba o saldo.
*/

public class ContaBancaria{

    String titular;
    int numero;
    double saldo;

    public void exibirSaldo (ContaBancaria contaBancaria){

        System.out.println("Olá, " + this.titular + "! O saldo atual da sua conta é de R$" + this.saldo);

    }

    public void deposita (ContaBancaria contaBancaria, double valorDeposito){

        this.saldo = this.saldo + valorDeposito;
        System.out.println("Valor depositádo com sucesso!");

    }

    public void sacar (ContaBancaria contaBancaria, double valorSaque){

        this.saldo = this.saldo - valorSaque;
        System.out.println("Valor sacado com sucesso!");

    }

}