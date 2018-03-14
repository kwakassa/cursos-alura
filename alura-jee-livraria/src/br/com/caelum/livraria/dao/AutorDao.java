package br.com.caelum.livraria.dao;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.caelum.livraria.modelo.Autor;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class AutorDao {

	//private Banco banco = new Banco();
	@PersistenceContext
	private EntityManager em;
	
	@PostConstruct
	void aposConstrucao(){
		System.out.println("Autor DAO foi Criado");
	}
	
	public void salva(Autor autor) {
		//banco.save(autor);
		em.persist(autor);
		System.out.println("Salvou autor " + autor.getNome());
	}
	
	public List<Autor> todosAutores() {
		//return banco.listaAutores();
		return em.createQuery("select a from Autor a", Autor.class).getResultList();
	}

	public Autor buscaPelaId(Integer autorId) {
		//Autor autor = this.banco.buscaPelaId(autorId);
		Autor autor = this.em.find(Autor.class, autorId);
		return autor;
	}
	
}
