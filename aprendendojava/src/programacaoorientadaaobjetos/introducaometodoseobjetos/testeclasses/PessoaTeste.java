package programacaoorientadaaobjetos.introducaometodoseobjetos.testeclasses;

import programacaoorientadaaobjetos.introducaometodoseobjetos.classes.Pessoa;

public class PessoaTeste {
    public static void main(String[] args) {

        Pessoa pessoa1 = Pessoa.criarPessoa("Arthur", 20);

        System.out.println("Nome: " + pessoa1.nome);
        System.out.println("Idade: " + pessoa1.idade);

    }
}
