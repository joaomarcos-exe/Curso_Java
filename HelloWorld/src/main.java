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

        //Scanner scan = new Scanner(System.in);
        //int n1=0, n2=2, n3=1;

        //System.out.println("Digite um numero: ");
        //n1=scan.nextInt();

        //System.out.println("Digite outro numero: ");
        //n2=scan.nextInt();

        //System.out.printf("Soma de %d com %d e igual a %d", n1, n2, n1+n2);

        //Declarando uma constante
        //final int teste = 20;

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
        //int[] numeros={10,20,30,40,50};

        //final int tam = 5;
        //int[] num = new int[tam];
        //for(int i=0; i<5; i++){
        //    System.out.println(numeros[i]);
        //}

        //Metodos de ARRAY
        //Array.sort(numeros)  Serve para ordenar em ordem crescente
        //Array.fill(numero, 10) ele preenche o array com um valor especifico
        //System.arraycopy() usado para copiar um array
        //Array.equals(num , numeros) ele compara 2 arrays
        //Array.binarySearch(num, p) ele ira ver se um determinado elemento tem em um array


        //Para apenas listar o elementos de um arrai podemos usar um tipo de for
       // for(int n:numeros){
       //     System.out.printf("%d - ", n);
       // }

        //final int linhas=3;
        //final int colunas = 5;
        //int[][] numeros = new int[linhas][colunas];

        msg("joao", 2);
        System.out.println(soma(10, 20, 50, 19));
        System.out.println(soma(10.5, 20.25, 50.10, 19.2));
    }
    //Para se criar um metodo e preciso ter modificador de acesso, tipo de retorno, nome  e parametros
    public static int soma(int...num){
        //neste tipo eu passo uma quantidade indefinida de elementos e sera como se fosse um array
        int res =0;
        for(int n:num){
            res+=n;
        }
        return res;
    }

    public static Double soma(Double...num){
        //neste tipo eu passo uma quantidade indefinida de elementos e sera como se fosse um array
        Double res = 0.0;
        for(Double n:num){
            res+=n;
        }
        return res;
    }

    public static int soma2(int n1, int n2){
        int res = n1 + n2;
        return res;
    };

    public static void msg(String m, int l){
        for(int i=0; i<l;i++){
            System.out.println(m);
        }
    }
}
