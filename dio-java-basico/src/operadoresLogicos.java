import javax.annotation.processing.SupportedOptions;

public class operadoresLogicos {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println("Operadores Lógicos");
        System.out.println(nomeCompleto);
        String concatenacao = "?";
        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);
        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);
        concatenacao= 1 + "1" + 1 + 1;
        System.out.println(concatenacao);
        concatenacao = "1" + (1+1+1);
        System.out.println(concatenacao);
        System.out.println("--------------------------------------------------------");
        int numero = 5;
        System.out.println(- numero);
        System.out.println(numero);
        System.out.println("----------------------------------------------------------");
        System.out.println(numero++);
        System.out.println(++numero);
        System.out.println(numero);
        System.out.println("===========================================================");
        System.out.println(numero--);
        System.out.println(--numero);
        System.out.println("-----------------------------------------------------------------");
        boolean acho = true;
        System.out.println(!acho);
        System.out.println(acho);


    }
}
