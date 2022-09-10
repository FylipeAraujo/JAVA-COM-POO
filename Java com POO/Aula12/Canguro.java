package Aula12;

public class Canguro extends Mamifero{

    public void usarBolsa(){
        System.out.println("Estou usando a bolsa");
    }

    @Override
    public void locomover() {
        System.out.println("Pulando");
    }
}
