package programacaoorientadaaobjetos.introducaometodoseobjetos.classes;

public class Retangulo {
    public double largura;
    public double altura;

    public double calcularArea() {
        double area = largura * altura;
        return area;
    }

    public double calcularPerimetro() {
        double perimetro = 2 * (largura + altura);
        return perimetro;
    }
}
