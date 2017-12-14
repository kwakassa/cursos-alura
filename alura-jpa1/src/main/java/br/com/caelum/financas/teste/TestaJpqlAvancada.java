package br.com.caelum.financas.teste;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import br.com.caelum.financas.dao.MovimentacaoDao;
import br.com.caelum.financas.helper.JPAUtil;
import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.modelo.TipoMovimentacao;

public class TestaJpqlAvancada {
	
	public static void testeSoma(){
		EntityManager manager = new JPAUtil().getEntityManager();

        Conta conta = new Conta();
        conta.setId(2);

        String jpql = "select sum(m.valor) from Movimentacao m where m.conta=:pConta "
                + "and m.tipoMovimentacao=:pTipo";

        Query query = manager.createQuery(jpql);

        query.setParameter("pConta", conta);
        query.setParameter("pTipo", TipoMovimentacao.SAIDA);

        BigDecimal resultado = (BigDecimal) query.getSingleResult();

        System.out.println("Total movimentado ..: R$ " + resultado);
	}
	
	public static void testeMedia(){
		EntityManager manager = new JPAUtil().getEntityManager();

        Conta conta = new Conta();
        conta.setId(2);
        
        MovimentacaoDao movimentacaoDao = new MovimentacaoDao(manager);
        
        Double resultado = movimentacaoDao.mediaDaContaPeloTipo(conta, TipoMovimentacao.SAIDA);

        System.out.println("Media movimentado ..: R$ " + resultado);
	}
	
	public static void main(String[] args) {
        testeMedia();
    }
}
