package Aula02;

public class Aulas02 {

    public static void main(String[] args) {
        Canetas c1= new Canetas();
        c1.cor="Azul";
        c1.ponta=0.5f;
        c1.tampar();
        c1.status();
        c1.rabiscar();

        // Criação de uma nova caneta//
        System.out.println("Nova caneta:" +"\n");

        Canetas c2=new Canetas();
        c2.modelo="bic";
        c2.cor="Preta";
        c2.ponta=0.5f;
        c2.destampar();
        c2.status();
        c2.rabiscar();

    }
}
