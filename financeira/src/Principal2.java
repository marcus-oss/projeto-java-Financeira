import financeira.modelo.ClienteFinanciavel;
import financeira.modelo.Funcionario;
import financeira.modelo.PessoaBonificavel;
import servico.ServicoPagamentoBonus;

public class Principal2 {

    public static void main(String[] args) {
//        ClienteFinanciavel funcionario = new Funcionario("aleatorio da silva", 19_000);
//        funcionario.


//        PessoaBonificavel funcionario = new Funcionario("aleatorio da silva", 19_000);
//        funcionario.calcularBonus(90);


        Funcionario funcionario = new Funcionario("aleatorio da silva", 19_000);
//        funcionario.calcularBonus(90);

        ServicoPagamentoBonus servicoPagamentoBonus = new ServicoPagamentoBonus();
        servicoPagamentoBonus.pagar(funcionario, 90);

    }
}
