package programacaoorientadaaobjetos.introducaometodoseobjetos.testeclasses;

import programacaoorientadaaobjetos.introducaometodoseobjetos.classes.Retangulo;

public class RetanguloTeste {
    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo();

        retangulo.largura = 7;
        retangulo.altura = 3;

        double areaRetangulo = retangulo.calcularArea();
        double perimetroRetangulo = retangulo.calcularPerimetro();

        System.out.println("Area: " + areaRetangulo);
        System.out.println("Perimetro: " + perimetroRetangulo);

    }
}
