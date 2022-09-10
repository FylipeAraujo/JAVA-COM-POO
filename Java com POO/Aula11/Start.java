package Aula11;

public class Start {
    public static void main(String[] args) {
        Visitante p1= new Visitante();
        p1.setNome("Juvenal");
        p1.setIdade(22);
        p1.setSexo("M");

        System.out.println(p1.toString());
        
        Alunos a1= new Alunos();
        a1.setNome("Claudio");
        a1.setMatricula(121212);
        a1.setCurso("Java com POO");
        a1.setIdade(20);
        a1.setSexo("M");
        a1.pagarMensalidade();

        Bolsista b1= new Bolsista();
        b1.setNome("Jubileu");
        b1.setMatricula(1214);
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();

    }
}
