public class Operadores {
    public static void main(String[] args) {
        
        String nome = "Linguagem";

        String sobrenome = "Java";

        String nomeCompleto = nome + " " + sobrenome;

        System.out.println(nomeCompleto);

        String concatenacao = "?";

        System.out.println(concatenacao);

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);
        
        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);
        
        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);
        
        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);
        
        concatenacao = "1"+(1+1+1+1);

        System.out.println(concatenacao);

        
    }
}
