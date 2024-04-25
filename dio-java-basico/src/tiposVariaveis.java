public class tiposVariaveis {
    public static void main(String[] args) {
        byte idade = 54;
        short ano = 2023;
        int cep = 6438190;
        long cpf = 14076822889L;
        float pi = 3.14F;
        double salario = 2500.44;
        
        long soma1 = idade + ano + cep + cpf;
        double soma2 = pi + salario;

        final double JUROS = 0.20;
        final double SALARIO_LIQUIDO = salario + (salario * JUROS);

        System.out.println("Exemplo de tipos de variavpeis,salario = " + salario);
        System.out.println("Resultado Inteiros: = " + soma1 + ", Resultado Reais: " + soma2);
        
        System.out.println("Salário Líquido: " + SALARIO_LIQUIDO);
    }
}
