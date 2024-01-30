package financeira.modelo;

public interface ClienteFinanciavel {

    double JUROS_BAIXO_RISCO = 1.0;
    double JUROS_MEDIORISCO = 1.5;
    double JUROS_ALTO_RISCO = 2.0;

    double calcularLimiteAprovado();


    default double calcularJuros(double valorSolicitado) {
        if (isFinanciamentoPequenoValor(valorSolicitado)) {
            return JUROS_BAIXO_RISCO;

        } else if (isFinanciamentoGrandeValor(valorSolicitado)) {
            return JUROS_MEDIORISCO;
        }
        return JUROS_ALTO_RISCO;
    }

    static boolean isFinanciamentoGrandeValor(double valorSolicitado) {
        return valorSolicitado <= 1_000_000;
    }

    static boolean isFinanciamentoPequenoValor(double valorSolicitado) {
        return valorSolicitado <= 100_00;
    }
}



