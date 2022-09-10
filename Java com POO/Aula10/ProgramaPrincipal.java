package Aula10;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Pessoa p0= new Pessoa();
        Alunos p1= new Alunos();
        Professor p2= new Professor();
        Funcionario p3= new Funcionario();

        p0.setNome("Pedro");
        p1.setNome("Maria");
        p2.setNome("Claudio");
        p3.setNome("Fabiana");


        System.out.println(p0.toString());
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());


    }
}
