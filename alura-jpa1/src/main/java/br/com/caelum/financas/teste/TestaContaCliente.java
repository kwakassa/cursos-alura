package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;

import br.com.caelum.financas.helper.JPAUtil;
import br.com.caelum.financas.modelo.Cliente;
import br.com.caelum.financas.modelo.Conta;

public class TestaContaCliente {
	public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Leonardo");
        cliente.setEndereco("Rua Fulano, 123");
        cliente.setProfissao("Professor");

        Conta conta = new Conta();
        conta.setId(2); // essa conta está no estado 'Detached' pois já possui um id!!

        cliente.setConta(conta);

        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();

        em.persist(cliente);

        em.getTransaction().commit();        


    }
}
