package programacaoorientadaaobjetos.introducaometodoseobjetos.classes;

public class Pessoa {
    public String nome;
    public int idade;

    public static Pessoa criarPessoa(String nome, int idade){
        Pessoa pessoa = new Pessoa();

        pessoa.nome = nome;
        pessoa.idade = idade;

        return pessoa;
    }
}
