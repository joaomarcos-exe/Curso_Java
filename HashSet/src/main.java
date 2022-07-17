import java.util.HashSet;
public class main {
    public static void main(String[] args) {
        //HashSet não armazena valores duplicado.

        HashSet<String> carros = new HashSet<String>();

        carros.add("Polo");
        carros.add("Camaro");
        carros.add("Camaro");//Se ja existir ira ser retornado falso
        carros.add("Subaru");

        System.out.println(carros);
    }
}
