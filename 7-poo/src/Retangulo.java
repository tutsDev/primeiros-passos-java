/*
Crie uma classe Retangulo com os atributos largura e altura.
Adicione métodos para calcular o perímetro do retângulo.
No método main, crie um objeto Retangulo, atribua valores para largura e altura, e imprima a área e o perímetro.
*/

public class Retangulo{
    
    double largura, altura;

    public void calculaArea(Retangulo retangulo){

        double area = this.largura * this.altura;
        System.out.println("Área: " + area);

    }

    public void calculaPerimetro(Retangulo retangulo){

        double perimetro = (largura * 2 ) + (altura * 2);
        System.out.println("Perimetro: " + perimetro); 

    }

}