package UEA_Aula07;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //metodos

    public void apresentar(){

        System.out.println("----------- UEC APRESENTA-----------");
        System.out.println("Lutador: "+getNome());
        System.out.println("Origem: "+ getNacionalidade());
        System.out.println(getIdade() + "Anos");
        System.out.println(getAltura() + " M de Alturas");
        System.out.println("Pesando: "+ getPeso());
        System.out.println("Vitorias: "+ getVitorias());
        System.out.println("Derrotas: "+ getDerrotas());
        System.out.println("Empates: "+ getEmpates());
        System.out.println("----------------------------------");
    }
    public void status(){
        System.out.println("-------------------------");
        System.out.println("Lutador " + getNome());
        System.out.println("E peso: "+ getCategoria());
        System.out.println("Vitorias: "+ getVitorias());
        System.out.println("Derrotas: "+ getDerrotas());
        System.out.println("Empates: "+ getEmpates());
        System.out.println("-------------------------");
    }
    public void ganharlutas(){
        this.setVitorias(getVitorias()+1);
    }
    public void perderlutas(){
        this.setDerrotas(getDerrotas()+1);
    }
    public void empatarlutas(){
        this.setEmpates(getEmpates()+1);
    }


    //construtor


    public Lutador(String nome, String nacionalidade, int idade, float altura,float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    //metodos acessores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (peso<52.2){
            categoria="Inv??lido";
        } else if(peso<=70.3){
            categoria="Leve";
        }else if(peso<=83.9){
            categoria="M??dio";
        }else if(peso<=120.2){
            categoria="Pesado";
        }else{
            categoria="Inv??lido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
