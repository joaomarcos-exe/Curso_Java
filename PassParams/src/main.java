public class main {
    public static void main(String[] args) {
    int res = soma(10,20,30,50,60);
        System.out.println(res);
    }
    //Com esses 3 pontos e como se fosse uma quantidade de parametros
    //indefindos ou seja podeomos passar quantos parametros queisermos
    //ele ira ira junta tudo em um array chamado n
    public static int soma(int... n) {
    int res = 0;
    for( int v:n){
        res+=v;
    }
    return res;
    }
}
