/*
Crie uma classe Carro com os atributos marca, modelo, ano, velocidadeMax e velocidadeAtual.
Adicione métodos para acelerar e frear o carro (que aumentam e diminuem a velocidadeAtual).
No método main, crie um objeto Carro, defina os atributos e simule o carro acelerando e freando.
*/

public class CarroMain {

    public static void main(String[] args) {
        
        Carro carro = new Carro();

        carro.marca = "Audi";
        carro.modelo = "RS8";
        carro.velocidadeMax = 320;
        carro.valocidadeAtual = 80;

        carro.aceleraCarro(carro);

        System.out.println("-------------------------");

        carro.freiaCarro(carro);

    }
    
}
