public class main {
    public static void main(String[] args){
        Jogador j1 = new Jogador(1);
        j1.num = 10;
        System.out.printf("Vidas: %d%n", j1.getVidas());
        j1.setVida(20);
        System.out.printf("Vidas: %d", j1.getVidas());
    }

}
