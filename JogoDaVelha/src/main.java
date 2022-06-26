import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        Board[][] velha = new Board[3][3];

        char simboloAtual='x';
        Boolean game = true;
        String vitoria="";
        Scanner scan = new Scanner(System.in);
        VerificandoVitoria(velha);
        iniciarJogo(velha);
        while(game){
            showBoard(velha);
            vitoria=VerificandoVitoria(velha);
            if(!vitoria.equals("")){
                System.out.printf("Jogador %s venceu", vitoria);
                break;
            }
            try{
                if(verificandojogada(velha, jogar(scan, simboloAtual), simboloAtual)){
                    if(simboloAtual =='x'){
                        simboloAtual='o';
                    }else{
                        simboloAtual='x';
                    }
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }
        System.out.println("Fim do jogo");

    }
    public static void showBoard(Board[][] velha){
        cleanWindow();
        for(int i = 0; i< 3; i++){
            System.out.print(i);
            System.out.print("|");
            for(int j = 0; j<3; j++){
                System.out.printf("%c|", velha[i][j].getSimbolo());
            }
            System.out.printf("%n");
        }
    }
    public static void cleanWindow(){
        for(int count=0; count <200; count++){
            System.out.println("");
        }
    }
    public static void iniciarJogo(Board[][] velha){
        for(int i=0; i< 3; i++){
            for(int j =0; j<3; j++){
                velha[i][j] = new Board();
            }
        }
    }
    public static String VerificandoVitoria(Board[][] velha){
        
        return "";
    }

    public static int[] jogar(Scanner scan, char sa){
        int p[]=new int[2];
        System.out.printf("%s %c%n", "Quem joga: ", sa);
        System.out.print("Informa a linha: ");
        p[0]=scan.nextInt();
        System.out.print("Informa a coluna: ");
        p[1]=scan.nextInt();
        return p;

    }

    public static Boolean verificandojogada(Board[][] velha, int p[], char simboloAtual){
        if(velha[p[0]][p[1]].getSimbolo() ==' '){
            velha[p[0]][p[1]].setSimbolo(simboloAtual);
            return true;
        }else{
            return false;
        }

    }
}
