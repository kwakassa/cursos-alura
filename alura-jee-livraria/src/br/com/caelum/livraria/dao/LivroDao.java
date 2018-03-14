package br.com.caelum.livraria.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.caelum.livraria.modelo.Livro;

@Stateless
public class LivroDao {

	//private Banco banco = new Banco();
	@PersistenceContext
	private EntityManager em;
	
	public void salva(Livro livro) {
		//banco.save(livro);
		em.persist(livro);
		System.out.println("Livro Salvo " + livro.getTitulo());
	}
	
	public List<Livro> todosLivros() {
		//return banco.listaLivros();
		return em.createQuery("select l from Livro l", Livro.class).getResultList();
	}
	
}
