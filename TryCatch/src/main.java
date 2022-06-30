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

        try{
            System.out.println(carros.get(10));
        }catch(IndexOutOfBoundsException e){
            System.out.println("ERROR: " + e.getMessage());
        }finally {
            System.out.println("Fim do TryCatch");
        }


    }
}
