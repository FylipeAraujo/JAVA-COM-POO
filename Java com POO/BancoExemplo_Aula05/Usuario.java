package BancoExemplo_Aula05;

public class Usuario {
    public static void main(String[] args) {
        /* Conta p1= new Conta();
        p1.setNumConta(20785);
        p1.setTitularConta("Jubileu");
        p1.abrirconta("CC");

        p1.depositar(100);
        p1.statusConta();

        Conta p2= new Conta();
        p2.setNumConta(19032);
        p2.setTitularConta("Creuza");
        p2.abrirconta("CP");


        p2.depositar(500);
        p2.sacar(100);
        p2.statusConta();
        */
      /* Conta p1= new Conta(2222,"CC","Fylipe");
        p1.abrirconta("CC");
        p1.depositar(1500);
        p1.sacar(100);
        p1.statusConta();*/

        Conta p1= new Conta(10204, "CC", "Cintia reis");
        p1.abrirconta("CC");
       // p1.sacar(20);
        p1.depositar(50000);
        p1.statusConta();
    }
}