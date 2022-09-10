package Aula11;

public class Bolsista extends Alunos{

    private float bolsa;

    public void renovarBolsa(){
        System.out.println("Renovando mensalidade do aluno "+ getNome());
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(getNome()+ " é bolsista, pagamento facilitado");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
