package aula1.br.com.empresa.banco.conta;
public class ContaPoupanca extends Conta {
	
	@Override
	public void atualiza(double taxa) {
		if (taxa >= 0 && taxa <= 1) {
			this.saldo += taxa * this.saldo * 3;
		} else {
			System.out.println("Taxa deve estar entre 0 e 1");
		}
    }

    public void deposita(double valor) {
        this.saldo += valor - 0.10;
    }

}

