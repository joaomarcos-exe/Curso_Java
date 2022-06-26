public class Board {
    private char simbolo;
    public Board(){
        this.simbolo= ' ';

    }
    public char getSimbolo(){
        return this.simbolo;
    }
    public void setSimbolo(char simbolo){
        if(this.simbolo==' '){
            this.simbolo = simbolo;
        }else{
            System.out.print("Campo já usado");
        }
    }
}
