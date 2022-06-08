import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //int num = 50;
        //String nome="joao";
        //System.out.println("Ola");
        //System.out.printf("Variavel num:%d%nNome:%s", num, nome);

        //IF, IF..ELSE, ?, SWITCH
        //IF
        // == < > >= <= != !

        Scanner scan = new Scanner(System.in);
        int n1=0, n2=2, n3=1;

        System.out.println("Digite um numero: ");
        n1=scan.nextInt();

        System.out.println("Digite outro numero: ");
        n2=scan.nextInt();

        System.out.printf("Soma de %d com %d e igual a %d", n1, n2, n1+n2);

        //Declarando uma constante
        final int teste = 20;

        /*FOR
        * for(int cont =0; cont < 5; cont++){
        *
        * }
        */

        /*WHILE
        * while(cont <5){
        * cont++;
        * }
        */

        /*DOWHILE
        *do{
        *   cont++;
        * }while(cont< 0)
        */

        //Array
        //int[] num = new int[5];
        //num[0]=1;
        int[] numeros={10,20,30,40,50};

        //final int tam = 5;
        //int[] num = new int[tam];
        for(int i=0; i<5; i++){
            System.out.println(numeros[i]);
        }
    }
}
