import veiculos.Veiculo;

//import veiculos.Veiculo; Utilizando esse import eu pego uma determinada classe dentro de um pacote.
public class Aviao extends Veiculo {
    private int categoria;
    public Aviao(String nome, int categoria){
        super(nome, 10);//Serve para referencias a construtora da classe que se extende
        this.categoria= categoria;
    }
    public void info(){
        super.info();
        System.out.printf("Caegoria: %s%n", this.categoria);
    }
}
