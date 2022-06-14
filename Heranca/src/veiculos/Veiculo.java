package veiculos;

public class Veiculo {
    //protected: Ele permite o acesso de fora da classe porem precisa ser uma classe que esta
    //extendida ou esta no mesmo pacote/pasta
    protected String nome;
    private int tipo;
    public Veiculo(String nome, int tipo){
        this.nome = nome;
        this.tipo = tipo;
    }
    public void info(){
        System.out.printf("Nome: %s%n", this.nome);
        System.out.printf("Tipo: %d%n", this.tipo);

    }
    public String getNome(){
        return this.nome;
    }
}
