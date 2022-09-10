package Aula13;

public class Cachorro extends Lobo{

    @Override
    public void emitirSom() {
        System.out.println("AU AU AU AU AU AU AU AU AU AUA AU AU");
    }
    public void reagir(String frase){
        if (frase=="olá" || frase=="toma comida"){
            System.out.println("Abanar e latir");
        }else {
            System.out.println("Rosnar");
        }
    }

    public void reagir(int hora, int min){
        if (hora<12){
            System.out.println("Abanar");
        } else if (hora>=18) {
            System.out.println("Ignorar");
        }else {
            System.out.println("Abanar e latir");
        }

    }
    public void  reagir(boolean dono){

        if (dono){
            System.out.println("Abanar");
        }else {
            System.out.println("Rosnar");
        }

    }

    public void reagir(int idade, float peso){

        if (peso<10 && idade<5){
            System.out.println("Abanar");
        } else{
            System.out.println();
        }

    }

}
