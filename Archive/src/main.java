//import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Path diretorio = Paths.get("D:\\Programacao\\Curso_Java");
        Path arquivo = Paths.get("D:\\Programacao\\Curso_Java\\teste.txt");
        Path arquivo2 = Paths.get("D:\\Programacao\\Curso_Java\\teste2.txt");


//        if(Files.isDirectory(diretorio)){
//            System.out.println("E um diretorio");
//        }
//        if(Files.exists(arquivo)){
//            System.out.println("Arquivo existe");
//        }
        try{
//            List<String> linhas = Files.readAllLines(arquivo);
//            for(String linha:linhas){
//                System.out.println(linha);
//            }
//            linhas.forEach(linha -> System.out.println(linha));
            byte[] bytesTeste = Files.readAllBytes(arquivo);
            Files.write(arquivo2, bytesTeste);

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
