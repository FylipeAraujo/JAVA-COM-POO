package Aula09;

public class PublicacaoLivro {

    public static void main(String[] args) {
        Pessoa[] p=new Pessoa[2];
        Livros[] l=new Livros[3];

        p[0]= new Pessoa("Pedro", 20, 'M');
        p[1]=new Pessoa("Maria", 25, 'F');

        l[0]=new Livros("Aprendendo Java","José da silva", 500, p[0]);
        l[1]=new Livros("Apredendo POO", "Maria candido", 800, p[1]);
        l[2]=new Livros("Java Avançado", "Pedro José", 300, p[0]);

        System.out.println(l[0].detalhes());

    }
}
