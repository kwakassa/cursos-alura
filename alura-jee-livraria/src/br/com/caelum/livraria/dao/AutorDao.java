package br.com.caelum.livraria.dao;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.caelum.livraria.modelo.Autor;

@Stateless
public class AutorDao {
	@Inject
	private EntityManager em;// = new Banco();
	
	@PostConstruct
	void aposCriacao(){
		System.out.println("[INFO] AutorDao foi criado.");
	}
	
	public void salva(Autor autor) {
		System.out.println("salvando autor " + autor.getNome());
		
		em.persist(autor);
		 System.out.println("[INFO] Salvou o Autor " + autor.getNome());
	}
	
	public List<Autor> todosAutores() {
		return em.createQuery("select s from Autor a",Autor.class).getResultList();
	}

	public Autor buscaPelaId(Integer autorId) {
		Autor autor = this.em.find(Autor.class,autorId);
		return autor;
	}
	
}
