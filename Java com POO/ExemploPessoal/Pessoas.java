package ExemploPessoal;

public class Pessoas {
     String nome;
     float altura;
     String nacionalidade;
     int idade;
     String sexo;
     boolean filhos;
     int qtd_filhos;

     void status(){
          System.out.println("Nome: " + this.nome);
          System.out.println("Idade: "+ this.idade);
          System.out.println("Sexo "+this.sexo);
          System.out.println("Altura: "+ this.altura);
          System.out.println("Nacionalidade: "+ this.nacionalidade);
          System.out.println("Tem filhos? "+ this.filhos);
          System.out.println("Quantos filhos? "+ this.qtd_filhos);
     }
     void estrageiro(){
          if (this.nacionalidade!= "brasil"){
               System.out.println(this.nome + " e estrageiro!");
          }else {
               System.out.println(this.nome + "e brasileiro(a)" );
          }
     }

     void idoso(){
          if (this.idade>=60){
               System.out.println(this.nome + " e idoso(a)");
          } else{
               System.out.println(this.nome + " e jovem");
          }
     }

}
