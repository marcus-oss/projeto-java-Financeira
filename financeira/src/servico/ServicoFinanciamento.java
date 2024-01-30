package servico;

import financeira.modelo.ClienteFinanciavel;


public class ServicoFinanciamento {
    public void solicitarFinanciamento(ClienteFinanciavel cliente, double valorSolicitado) {
        double limiteAprovado = cliente.calcularLimiteAprovado();
        double jurosCalculado = cliente.calcularJuros(valorSolicitado);

        if (limiteAprovado < valorSolicitado) {
            throw new RuntimeException(String.format(
                    "Financiamento não aprovado. Limite máximo de %.2f", limiteAprovado));
        }

        System.out.printf("DEBUG: Financiamento aprovado no valor de  R$%.2f com juros de %.2f%%. Limite máximo de %.2f%n",
                valorSolicitado, jurosCalculado, limiteAprovado);
    }

    public double consultarLimiteAprovado(ClienteFinanciavel empresa) {

        return empresa.calcularLimiteAprovado();
    }

}
