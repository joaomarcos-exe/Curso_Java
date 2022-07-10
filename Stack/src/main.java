import java.util.Stack;
public class main {
    public static void main(String[] args) {
        Stack<String> carros = new Stack<>();

        carros.push("Mercedz");
        carros.push("Golf");
        carros.push("Camaro");
        carros.push("Rand Hover");

        System.out.println(carros.peek());//Retorna o elemento que esta no topo
        System.out.println(carros.pop());//Retorna o elemento que esta no topo e retira
        System.out.println(carros);
//        for(String c:carros){
//            System.out.println(c);
//        }
//        carros.forEach(carro -> System.out.println(carro));
    }
}
