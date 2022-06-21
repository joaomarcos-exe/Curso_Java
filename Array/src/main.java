public class main {
    public static void main(String[] args){
//        final int tamanho=5;
//        int[] num = new int[tamanho];
//        num[0] = 1;
//        num[1] = 2;
//        num[2] = 3;
//        num[3] = 4;
//        num[4] = 5;

        //Posso criar um array de uma classe
//        Carro[] carros = new Carro[tamanho];
//        carros[0] = new Carro("carro");
//        carros[0].info();
       // for(int i = num.length; i >0; i--){
       //     System.out.println(num[i-1]);
       // }

        //Esse e um loop para arrays ou forEach
        //for(int n:num){
        //    System.out.println(num[n-1]);
        //}

//        String nome = "joao";
//        for( char c:nome.toCharArray()){
//            System.out.println(c);
//        }

//----------------------------------------------------
        //Passando arrays para dentro de uma função
//        int[] nums ={10,20,30,40,50,65};
//        parImpar(nums);


        int[] notas = {10,20,60,90,50,80,35};
        int apr = 0, rep = 0;
        int[] resultados = {0,0};
        conferirNotas(notas, resultados);
        System.out.printf("Aprovados:%d%n", resultados[0]);
        System.out.printf("Reprovados:%d%n", resultados[1]);

    }
    //Variaveis não são passados por referencia e se precisarmos que o valor
    //Seja alterados podemos criar um array para que guarde os valores.
    public static void conferirNotas(int[] n, int[] r){
        for( int num:n){
            if(num>=60){
                r[0]++;
            }else{
                r[1]++;
            }
        }
    }

//    public static void parImpar(int[] n){
//        for( int num:n){
//            if(num%2 == 0){
//                System.out.printf("%d e par%n", num);
//            }
//        }
//    }
}
