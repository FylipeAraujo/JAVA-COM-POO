package Aula03;


public class Aulas03 {

    public static void main(String[] args) {
        Canetas c1=new Canetas();
        c1.modelo="BIC cristal";
        c1.cor="Azul";
        //c1.ponta= 0.5f; o atributo é privado na claa caneta.
        c1.carga=80;
        c1.tampada=true;
        c1.status();
        c1.rabiscar();

    }
}
