package candidatura;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        //analisarCandidato(2000.51);
        selecaoCandidatos();
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.50;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para candidato com contra proposta");

        } else {
            System.out.println("Eliminar candidatura");
        }
    } 
    
    static void selecaoCandidatos() {
        String[] candidatos = {"Petrukio", "Catarina", "Neca", "Calixto"};
        double[] salarioPorcandidato = {2500.0, 1900.50, 2000.0, 3500.0};

        for (String nome : candidatos) {
            System.out.println(nome);
        }
        //int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosAtual <= 3) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = salarioPorcandidato[candidatosAtual];

            if (salarioBase < salarioPretendido) {
                 System.out.println("Ligar para candidato " + candidato + ", Salario pretendido = " + salarioPretendido);
            }
           
            candidatosAtual++;

        }
        
    }
}
