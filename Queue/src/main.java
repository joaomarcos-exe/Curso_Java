//import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
public class main {
    public static void main(String[] args) {
        Queue<String> carros = new LinkedList<>();

        carros.add("Mercedz");
        carros.add("Golf");
        carros.add("Camaro");
        carros.add("Rand Hover");
//
//        System.out.println(carros.peek());//Retorna o elemento que esta no topo
//        System.out.println(carros.pop());//Retorna o elemento que esta no topo e retira
//        System.out.println(carros);
//        for(String c:carros){
//            System.out.println(c);
//        }
//        carros.forEach(carro -> System.out.println(carro));
        System.out.println(carros.peek());
        System.out.println(carros.poll());
        System.out.println(carros);
    }
}
