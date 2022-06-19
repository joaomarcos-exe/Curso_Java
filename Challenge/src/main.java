import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        final byte numQuestions = 5;
        final int[] res = new int[]{1, 1, 3, 3,1};
        int[] resUser = new int[5];
        byte result = 0;
        String[] questions = new String[]{ "Qual a maior estrela do sistema sola?", "Qual a primeira letra do nosso alfabeto?", "2x10 e igual a?", "Qual o valor de PI?", "Em que linguaguens esta codigo foi escrito? "};
        String[] resultQuestions = new String[]{"1)Sol 2)Lua 3)Marte", "1)A 2)C 3)Z", "1)5 2)22 3)20", "1)3 2)3,12 3)3,14", "1)Java 2)Python 3)Lua"};
        for(byte i = 0;i < numQuestions ; i++){
            System.out.println("\n" + questions[i]);
            System.out.println(resultQuestions[i]);
            resUser[i] = scann.nextInt();
        }
        for(byte i = 0; i< numQuestions; i++){
            if(resUser[i] == res[i]){
                result++;
            }
        }
        System.out.printf("%nVoce Acertou: %d/5%n", result);

    }
}
