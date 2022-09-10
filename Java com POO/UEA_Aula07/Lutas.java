package UEA_Aula07;

import java.util.Random;

public class Lutas{
    //Atributos
    private   Lutador desafiante;
    private  Lutador desafiado;
    private int round;
    private boolean aprovada;

    //Métodos
    public void marcarluta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria())&& l1!=l2){
            this.setAprovada(true);
            this.desafiado=l1;
            this.desafiante=l2;
        }else{
            this.setAprovada(false);
            this.desafiado=null;
            this.desafiante=null;
        }

    }
    public void lutar(){
        if (this.isAprovada()) {
            desafiado.apresentar();
            desafiante.apresentar();
            Random aleatorio =  new Random();
            int vecendor= aleatorio.nextInt(3);
            System.out.println("------RESULTADO DA LUTA---------");
            switch (vecendor){
                case 0: //Empate
                    System.out.println("luta empatada");
                    this.desafiante.empatarlutas();
                    this.desafiado.empatarlutas();
                    break;

                case 1: //Lutador 1 vence
                    System.out.println("Lutador " + this.desafiado.getNome() + " Ganhou a luta");
                    this.desafiado.ganharlutas();
                    this.desafiante.perderlutas();
                    break;

                case 2: // Lutador 2 vence
                    System.out.println("Lutador :" + this.desafiante.getNome()+ "Ganhou a luta");
                    this.desafiante.ganharlutas();
                    this.desafiado.perderlutas();
                    break;
            }
            System.out.println("---------------------------------");

        }else{
            System.out.println("Luta não pode acontecer!!!");
        }

    }
    //Métodos Acessores

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}

