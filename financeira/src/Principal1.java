import financeira.modelo.*;
import servico.ServicoFinanciamento;


public class Principal1 {
    public static void main(String[] args) {

        var servicoFinanciamento = new ServicoFinanciamento();
        var fazenda = new Fazenda("Fazenda Dona Benedita", 5_000_000, 5);
        var industria = new Industria("Alimentos da Vovó", 5_000_000, true);
        var parceiro = new ParceiroFinanceiro("Capital Fazenda", 2_000_00);
        var funcionario = new Funcionario("Jõao da silva", 18_000);

        System.out.printf("Juros baixo risco: %.2f%n", ClienteFinanciavel.JUROS_BAIXO_RISCO);


//        servicoFinanciamento.solicitarFinanciamento(funcionario, 200_00);
//        servicoFinanciamento.solicitarFinanciamento(fazenda, 3_000_00);
//        servicoFinanciamento.solicitarFinanciamento(industria, 600_000);

    }
}