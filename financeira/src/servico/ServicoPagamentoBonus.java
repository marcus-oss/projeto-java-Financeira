package servico;

import financeira.modelo.PessoaBonificavel;

public class ServicoPagamentoBonus {

    public void pagar(PessoaBonificavel pessoa, double percentualMetaAlcancada) {
        double valorBonus = pessoa.calcularBonus(percentualMetaAlcancada);

        System.out.printf("DEBUG: Bonus pago no valor de %.2f", valorBonus);

    }
}
