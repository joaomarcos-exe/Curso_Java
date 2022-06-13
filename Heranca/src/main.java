public class main {
    public static void main(String[] args) {
        Carro c1 = new Carro("Gol");
        Carro c2 = new Carro("HRV");
        CarroCombate c3 = new CarroCombate("Leopardo", 100);
        CarroCombate c4 = new CarroCombate("Jaguar", 100);

        c1.setLigado(true);
        c3.atirar();
        c1.info();
        c2.info();
        c3.info();
        c4.info();

    }
}
