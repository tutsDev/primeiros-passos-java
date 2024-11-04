/*
Crie uma classe Carro com os atributos marca, modelo, ano, velocidadeMax e velocidadeAtual.
Adicione métodos para acelerar e frear o carro (que aumentam e diminuem a velocidadeAtual).
No método main, crie um objeto Carro, defina os atributos e simule o carro acelerando e freando.
*/

public class Carro {

    String marca, modelo;
    int ano, velocidadeMax, valocidadeAtual;

    public void aceleraCarro(Carro carro){

        while (this.valocidadeAtual <= this.velocidadeMax) {

            System.out.println("Acelerando: O carro está á " + valocidadeAtual + "Km/h");
            valocidadeAtual++;
            
        }

        System.out.println("Calma filho, quer morrer?");

    }

    public void freiaCarro(Carro carro){

        while (this.valocidadeAtual >= 0) {

            System.out.println("Freiando: O carro está á " + valocidadeAtual + "Km/h");
            valocidadeAtual--;
            
        }

        System.out.println("Paroooooou!");

    }
    
}
