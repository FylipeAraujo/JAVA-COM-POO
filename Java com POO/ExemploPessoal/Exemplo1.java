package ExemploPessoal;

public class Exemplo1 {
    public static void main(String[] args) {
        Pessoas pessoa1= new Pessoas();
        pessoa1.nome="Fylipe";
        pessoa1.idade=20;
        pessoa1.sexo= "Masculino";
        pessoa1.altura=1.73f;
        pessoa1.nacionalidade="brasil";
        pessoa1.filhos=false;
        pessoa1.qtd_filhos=0;

        pessoa1.status();
        pessoa1.estrageiro();
        pessoa1.idoso();


        Pessoas pessoa2= new Pessoas();
        pessoa2.nome="Cintia";
        pessoa2.idade=80;
        pessoa2.sexo= "Feminino";
        pessoa2.altura=1.53f;
        pessoa2.nacionalidade="França";
        pessoa2.filhos=false;
        pessoa2.qtd_filhos=0;

        pessoa2.status();
        pessoa2.estrageiro();
        pessoa2.idoso();


    }
}
