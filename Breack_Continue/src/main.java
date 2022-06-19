public class main {
    public static void main(String[] arg){
        int cont = 100;
        for(int i =0; i<cont; i++){

            //if(i>=10){
           //     break;//O break encerra o for e pode ser usado while, do while, for e switch
            //}
            if(i>=10 && i<=60){
                continue;//O continue elepula para  a proxima interação
            }
            System.out.println(i);
        }
    }
}
