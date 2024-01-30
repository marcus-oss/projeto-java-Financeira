package financeira.modelo;

public class ParceiroFinanceiro extends Empresa {

    private double valorTotalAplicado;

    public ParceiroFinanceiro(String razaoSocial, double totalFaturamento) {
        super(razaoSocial, totalFaturamento);
        this.valorTotalAplicado = valorTotalAplicado;
    }

    public double getValorTotalAplicado() {
        return valorTotalAplicado;
    }

    public void adicionarNovaAplicacao(double valorAplicado) {
        valorTotalAplicado += valorAplicado;


    }

}
