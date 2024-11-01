/*
Crie uma classe chamada Pessoa, com os atributos nome e idade.
Adicione um método chamado exibirDados que imprime o nome e a idade da 
pessoa.
No método main, crie um objeto da classe Pessoa, atribua valores para os 
atributos e chame o método exibirDados.
*/

public class Pessoa {

    String nome;
    int idade;

    public void exibirDados(Pessoa pessoa){
        
        System.out.println(this.nome);
        System.out.println(this.idade);

    }
    
}
