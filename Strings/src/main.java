public class main {
    public static void main(String[] args) {
        char[] texto={'c', 'u', 'r', 's', 'o'};
        char[] texto2 = new char[10];
        String nome = new String("CFB Cursos");
        int tam;
        char c;

        String s1 = new String("Bruno");
        String s2 = "bruno";
        String s3 = "Curso de Java       ";
        String s4 = "CFB Curso de Java";
        String s5 = "CFB Cursos";

        //length, charAt e getChars
//        tam = nome.length();//Ira me retornar o tamanho da string
//
//        c = nome.charAt(3);//Ira me retornar o caractere que esta na posiçõa que passei;
//
//        nome.getChars(4, 9, texto2, 0);
//
//        System.out.println(texto2);

        //regionMatches
        //Com ele podemos compara parte de uma string
        if(s4.regionMatches(true,0,s5, 0, 10)){
            System.out.println("s4 E igual s5");
        }


        //compareTo
        //Ira compara duas strings e se forem iguai seu retorno sera 0 e um
        //negativo quando a primeira for menor e positivo quando a primeira for maior
        System.out.println(s1.compareTo(s2));


        //equalsToIgonecase
        //Ignora caracteres maiusculos e minusculos
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("E igual");
        }else{
            System.out.println("E diferente");
        }


        //equals vs ==
        //A melhor forma para fazer a comparação do conteudo de uma string e
        // melhor usar o equals pois se els estvier instanciada e compara
        //com uma que não esteja ira dar diferente
        if(s1.equals(s2)){
            System.out.println("E igual");
        }

        //startsWith e endWith
        if(s3.startsWith("Curso")){
            System.out.println("Começa com Curso");
        }else{
            System.out.println("Falso");
        }

        if(s3.endsWith("Java")){
            System.out.println("Termina com Java");
        }

        //indexOf
        //Ira localizar um caractere e me retornar a posição dele ou ondex a string começa
        //Sera retornado a posição do primeiro a se encontrado
        System.out.println(s3.indexOf("J"));

        //substring
        //Ele ira me retornar parte de uma string
        System.out.println(s3.substring(0, 5));

        //concat
        //serve para que possamos concaternar 2 strings
        System.out.println(s1.concat(s2));

        //replace
        //Podemos usar para substituir elementos em uma string
        System.out.println(s3.replace("C", "D"));

        //toLowerCase = toUppercase
        System.out.println(s2.toLowerCase());
        System.out.println(s2.toUpperCase());

        //trim
        //serve para podermos remover os espações que estão no inicio
        // e no final da string
        System.out.println(s3.trim());


        //toCharArray
        //converte a string para um array de char
        char[] sla = s3.toCharArray();

        //split
        //ele ira separa a string de acordo com o que for especificado
        String[ ] s6 = s3.split(" ");
        for(String s:s6){
            System.out.println(s);
        }

    }
}
