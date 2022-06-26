import java.security.SecureRandom;
public class main {
    public static void main(String[] args) {
        int[][] numeros= new int[3][3];
        for(int i = 0; i< 3; i++){
            for(int j = 0; j <3; j++){
                numeros[i][j]= new SecureRandom().nextInt(100);
                System.out.printf("%d ",numeros[i][j]);
            }
            System.out.printf("%n");
        }
    }
}
