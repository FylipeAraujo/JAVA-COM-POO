package BancoExemplo_Aula05;

public class Conta {

   public int numConta;
   protected String tipoConta;
   private String titularConta;
   private float saldo;
   private Boolean status;


   public void statusConta(){
       System.out.println("--------------------------------------------");
       System.out.println("Conta criada com sucesso");
       System.out.println("--------------------------------------------");
       System.out.println("Numero da conta "+ this.getNumConta());
       System.out.println("Tipo da conta "+ this.getTipoConta());
       System.out.println("Titular da conta: " + this.getTitularConta());
       System.out.println("Saldo da conta: "+ this.getSaldo());
       System.out.println("A conta ta ativa? " + this.getStatus());
   }


    public void abrirconta(String tipoConta){
        this.setTipoConta(tipoConta);
        this.setStatus(true);
        if (tipoConta=="CC"){
            this.setSaldo(50);
        }else{
            this.setSaldo(150);
        }

    }
    public void fecharConta(){
        if(this.getSaldo()>0){
            System.out.println("Conta com dinheiro");
        }else if(this.getSaldo()<0){
            System.out.println("Conta em Debito");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }

    }
    public void depositar(float valorDeposito){
        if (this.getStatus()){
            this.setSaldo(getSaldo()+valorDeposito);
            System.out.println("Deposito realizado com sucesso");
        }else{
            System.out.println("Impossivel depositar, conta fechada");
        }
    }
    public void sacar(float valorSaque){
        if (this.getStatus() && this.getSaldo()>=valorSaque){
            this.setSaldo(getSaldo()-valorSaque);
            System.out.println("Saque realizado com sucesso");
        }else{
            System.out.println("Impossivel sacar");
        }

    }
    public void pagarMensal( float mensal){
        if (this.getTipoConta()=="CC"){
            mensal=12;
        }else if (this.getTipoConta()=="CP"){
            mensal=20;
        } else if (this.getStatus()) {
            if ( this.getSaldo()>mensal){
                this.setSaldo(getSaldo()-mensal);
                System.out.println("Mensalidade paga com sucesso");
            } else{
                System.out.println("Saldo insuficiente");
            }
        }else {
            System.out.println("Impossivel pagar");
        }


    }


    public Conta(int numConta, String tipoConta, String titularConta) {
        this.numConta = numConta;
        this.tipoConta = tipoConta;
        this.titularConta = titularConta;
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getTitularConta() {
        return titularConta;
    }

    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
