package Aula04;

public class Aula04 {
    public String modelo;
    private float ponta;

    private boolean tampada;

    private String cor;

    //Este é o metodo cosntrutor, onde tem que receber o mesmo nome da class
    public  Aula04( String m,String c, float p){
        this.setModelo(m);
        this.setCor(c);
        this.setPonta(p);
        this.tampar();
    }



    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void tampar(){
        this.tampada= true;
    }
    public void destampada(){
        this.tampada=false;
    }


    public void status(){
        System.out.println("SOBRE A CANETA");
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Ponta: "+ this.ponta);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
}
