package br.com.caelum.financas.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.caelum.financas.helper.JPAUtil;
import br.com.caelum.financas.modelo.Conta;

public class TesteMovimentacaoConta {
	public static void main(String[] args) {

		EntityManager manager = new JPAUtil().getEntityManager();

		Query query = manager.createQuery("select c from Conta c join fetch c.movimentacoes");

		List<Conta> contas = query.getResultList();
		
		for (Conta conta : contas) {
			System.out.println("Conta de " + conta.getTitular());
            System.out.println("Número de movimentações ...: " + conta.getMovimentacoes().size());
        }
	}
}
