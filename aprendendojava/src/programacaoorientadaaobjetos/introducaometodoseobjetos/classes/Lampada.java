package programacaoorientadaaobjetos.introducaometodoseobjetos.classes;

public class Lampada {

    public boolean estado;

    public boolean ligar(){
        return estado = true;
    }

    public boolean desligar(){
        return estado = false;
    }

    public void mostrarEstado(){
        if (estado == true){
            System.out.println("Lâmpada LIGADA!");
        } else {
            System.out.println("Lampada DESLIGADA!");
        }
    }
}
