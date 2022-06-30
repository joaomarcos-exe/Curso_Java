import java.util.ArrayList;
public class main {
    public static void main(String[] args) {
        //O ArrayList e um tipo de array turbinado com algumas funções a mais
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<String> carros = new ArrayList<>();

        numeros.add(11);
        numeros.add(22);
        numeros.add(33);

        carros.add("Camaro");
        carros.add("Honda civic");
        carros.add("Rand Rover");
//        carros.add(0,"FIAT ARGO");
        //Ira zerar todos os elementos do ArrayList
//        carros.clear();

        //Ira dizer qual o index do dado no ArrayList
        carros.indexOf("Camaro");

        //Podemos escolhe remocer um elemento e ira retornar um boolean para
        //dizer que foi removido
        carros.remove("Rand Rover");

        //Ele ira eliminar os espaços vazios no array deixando apenas os usados
        carros.trimToSize();



        System.out.println(carros.get(0));
        for(int i=0; i<carros.size(); i++){
            System.out.println(carros.get(i));
        }

//        for(int n:numeros){
//            System.out.printf("%d%n", n);
//        }
//        for (String cars:carros){
//            System.out.printf("%s%n", cars);
//        }
    }
}
