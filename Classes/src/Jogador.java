public class Jogador {

    //Atributos são variaveis criadas dentro da classe
    private final int maxVidas=3;
    public int num;//Quando ele e publico se pode modificalo fora da classe
    private int vidas = 100; //Como ele e privado só pode ser modificado dentro da classe.

    static boolean alerta = false;
    static int qtdjogadores = 0;
    public Jogador(int num){
        this.num=num;
        //Esse e um metodo construtor pois tem o mesmo nome da classe
        System.out.printf("Jogardor numero %d criado%n", num);
        //O metodo construtor e executado toda vez que uma classe e instanciada
    }

    //Esse e um metodo get usado apenas para pegar informação de uma variavel privada que esta dentro da
    //classe
    public int getVidas(){
        return this.vidas;
    }

    //E um metodo para atribuir um valor a uma variavel privada e dessa forma temos um controle maior
    public void setVida(int vidas){
        if(vidas > this.maxVidas){
            this.vidas=maxVidas;
        }else if(vidas < 0){
            this.vidas = 0;
        }else{
            this.vidas = vidas;
        }

    }

    //Static
    //Metodos static permite com que seja possivel usar uma classe sem preicsar instaciar a classe
    public void info(){
        System.out.printf("%nVidas:%d", this.vidas);
        System.out.printf("%nAlerta:%s", alerta ? "Sim" : "Não");
        System.out.printf("%nJogadores:%d", qtdjogadores);

    }
}
