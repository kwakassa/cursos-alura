package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.financas.modelo.Conta;

public class TesteListaUmaConta {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setTitular("Leonardo");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("financas");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		Conta contaFound = em.find(Conta.class, 1);
		
		System.out.println("Titular Conta: " + contaFound.getTitular());
		
		em.getTransaction().commit();

		em.close();
		emf.close();
	}
}
