public class main {
    public static void main(){
        final int tamanho=5;
        int[] num = new int[tamanho];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
        num[4] = 5;

        //Posso criar um array de uma classe
        Carro[] carros = new Carro[tamanho];
        carros[0] = new Carro("carro");
        carros[0].info();
       // for(int i = num.length; i >0; i--){
       //     System.out.println(num[i-1]);
       // }

        //Esse e um loop para arrays
        //for(int n:num){
        //    System.out.println(num[n-1]);
        //}
    }
}
