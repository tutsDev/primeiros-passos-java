package programacaoorientadaaobjetos.introducaometodoseobjetos.testeclasses;

import programacaoorientadaaobjetos.introducaometodoseobjetos.classes.Lampada;

public class LampadaTeste {
    public static void main(String[] args) {

        Lampada lampadaSala = new Lampada();
        Lampada lampadaQuarto = new Lampada();

        lampadaSala.desligar();
        lampadaQuarto.ligar();

        lampadaSala.mostrarEstado();
        lampadaQuarto.mostrarEstado();

    }
}
