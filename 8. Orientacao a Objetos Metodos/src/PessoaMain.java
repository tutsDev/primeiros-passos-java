/*
Crie uma classe chamada Pessoa, com os atributos nome e idade.
Adicione um método chamado exibirDados que imprime o nome e a idade da 
pessoa.
No método main, crie um objeto da classe Pessoa, atribua valores para os 
atributos e chame o método exibirDados.
*/

public class PessoaMain {
    
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa();

        pessoa.nome = "Maria";
        pessoa.idade = 18;

        pessoa.exibirDados(pessoa);

    }

}
