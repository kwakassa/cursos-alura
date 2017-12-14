package br.com.caelum.financas.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.caelum.financas.helper.JPAUtil;
import br.com.caelum.financas.modelo.Categoria;
import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.modelo.Movimentacao;

public class TestaConsulta {
	
	public static void consultaMovimentacao(){
		EntityManager manager = new JPAUtil().getEntityManager();

        Conta conta = new Conta();
        conta.setId(2);

        Query query = manager
                .createQuery("select m from Movimentacao m where m.conta = :pConta"
                        + " and m.tipoMovimentacao = :pTipo"
                        + " order by m.valor desc");

        query.setParameter("pConta", conta);

        List<Movimentacao> movimentacoes = query.getResultList();

        for (Movimentacao m : movimentacoes) {
            System.out.println("\nDescricao ..: " + m.getDescricao());
            System.out.println("Valor ......: R$ " + m.getValor());
        }
	}
	
	public static void consultaMovimentacaoPorCategoria(){
		EntityManager manager = new JPAUtil().getEntityManager();

        Categoria categoria = new Categoria();
        categoria.setId(33);//Verificar no banco um ID de exemplo

        Query query = manager
                .createQuery("select m from Movimentacao m join m.categorias c where c = :pCategoria");

        query.setParameter("pCategoria", categoria);

        List<Movimentacao> movimentacoes = query.getResultList();

        for (Movimentacao m : movimentacoes) {
            System.out.println("\nDescricao ..: " + m.getDescricao());
            System.out.println("Valor ......: R$ " + m.getValor());
        }
	}
	
	public static void main(String[] args) {
		consultaMovimentacaoPorCategoria();
    }
}
