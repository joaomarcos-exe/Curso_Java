import java.util.Scanner;
public class Calculadora {
    static public void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Numero n1 = new Numero();
        Numero n2 = new Numero();
        Numero res = new Numero();
        String opc = "S";

        while(opc.equals("S") || opc.equals("s")){

            System.out.printf("%nDigite o valor 1: ");
            n1.setNum(scan.nextInt());
            System.out.printf("%nDigite o valor 2: ");
            n2.setNum(scan.nextInt());
            res.setNum(n1.getNum() + n2.getNum());
            System.out.printf("%nResultado: %d", res.getNum());
            System.out.printf("%n Deseja somar outro valor? ");
            opc = scan.next();
            System.out.printf("%n%n%n");
        }
    }
}
