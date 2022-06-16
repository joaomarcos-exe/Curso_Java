//interface e uma especificação para outras classes e tudo que estiver na interface
// dever ser implementoda na classe.
//Não se pode usar private na Interface
public interface SerVivo {
    //Atributos não são muito comuns de serem implementadsa na interface
    //porque não se pode modificar o resultado diretamnete.
    // e deve ser iniciados
    public Boolean vivo = true;
    public void mover();
    public void comer(int massa);
    public void info();
}
