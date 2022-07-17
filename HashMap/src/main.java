import java.util.HashMap;
public class main {
    public static void main(String[] args) {

        HashMap<Integer, String> carros = new HashMap<Integer, String>();

        carros.put(1, "Polo");
        carros.put(2, "Camaro");
        carros.put(3, "HRV");
        carros.put(4, "Subaru");

        System.out.println(carros);
        System.out.println(carros.get(2));
        carros.remove(4);
        System.out.println(carros);

    }
}
