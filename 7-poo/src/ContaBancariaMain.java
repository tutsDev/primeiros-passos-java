/*
Crie uma classe Conta que representa uma conta bancária, com atributos titular, numero, saldo.
Adicione métodos para depositar, sacar e exibir o saldo.
No método main, crie uma conta, faça depósitos, saques e exiba o saldo.
*/

public class ContaBancariaMain {

    public static void main(String[] args) {
        
        ContaBancaria conta1 = new ContaBancaria();

        conta1.titular = "Arthur Soares Pereira";
        conta1.numero = 2707041;
        conta1.saldo = 1200;

        System.out.println("---Saldo Inicial---");
        conta1.exibirSaldo(conta1);

        System.out.println("---Depositando---");
        conta1.deposita(conta1, 1250.50);

        System.out.println("---Saldo Pós Depósito---");
        conta1.exibirSaldo(conta1);

        System.out.println("---Sacando---");
        conta1.sacar(conta1, 500.50);

        System.out.println("---Saldo Pós Saque---");
        conta1.exibirSaldo(conta1);
    }
    
}
