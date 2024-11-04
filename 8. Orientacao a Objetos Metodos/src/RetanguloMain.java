/*
Crie uma classe Retangulo com os atributos largura e altura.
Adicione métodos para calcular a área e o perímetro do retângulo.
No método main, crie um objeto Retangulo, atribua valores para largura e altura, e imprima a área e o perímetro.
*/

public class RetanguloMain {

    public static void main(String[] args) {
        
        Retangulo retangulo = new Retangulo();

        retangulo.largura = 5;
        retangulo.altura = 3;

        retangulo.calculaArea(retangulo);
        retangulo.calculaPerimetro(retangulo);

    }
    
}