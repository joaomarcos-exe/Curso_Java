import java.util.ArrayList;
import java.util.Iterator;
public class main {
    public static void main(String[] args) {
        //HashSet não armazena valores duplicado.

        ArrayList<String> carros = new ArrayList<String>();

        carros.add("Polo");
        carros.add("Camaro");
        carros.add("Camaro");//Se ja existir ira ser retornado falso
        carros.add("Subaru");
        //Iterator serve para que possamos interrar sobre o array
        System.out.println(carros);

        Iterator<String> it = carros.iterator();

        while(it.hasNext()){

            System.out.println(it.next());
        }
    }
}