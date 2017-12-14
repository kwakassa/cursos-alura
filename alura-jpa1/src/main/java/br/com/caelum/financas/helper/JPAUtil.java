package br.com.caelum.financas.helper;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.financas.modelo.PersistenceConstants;

public class JPAUtil {

	private EntityManagerFactory emf;
	private EntityManager em;
	private String persistenceUnit = "financas";
	private Map<String,String> properties;
	
	public JPAUtil() {
		initMapProperties();
	}
	
	private void initMapProperties(){
			properties = new HashMap<String,String>();
			properties.put("javax.persistence.provider", "org.hibernate.jpa.HibernatePersistenceProvider");
			properties.put("javax.persistence.jdbc.driver", "org.h2.Driver");
			properties.put("javax.persistence.jdbc.url", "jdbc:h2:file:C:/apl/alura/h2/jpaDB");
			properties.put("javax.persistence.jdbc.user", "admin");
			properties.put("javax.persistence.jdbc.password", "admin");
			properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
			properties.put("hibernate.hbm2ddl.auto", "create");
			properties.put("hibernate.show_sql", "true");
			properties.put("hibernate.format_sql", "true");
			properties.put("hibernate.use_sql_comments", "true");
			properties.put("log4j.logger.org.hibernate.SQL", "DEBUG");
	}
	
	public EntityManager getEntityManager() {
		checkAttributes();
		return em;
	}
	public EntityManager getEntityManagerWithProperties() {
		emf = Persistence.createEntityManagerFactory(this.persistenceUnit,properties);
		em = emf.createEntityManager(properties);
		return em;
	}
	public EntityManager getEntityManager(String persistenceUnit) {
		this.persistenceUnit = persistenceUnit;
		updateAttributes();
		return em;
	}

	public EntityManager updateProperties(String key, String value) {
		Map<String, Object> properties = em.getProperties();
		Object val = properties.get(key);
		if (val != null) {
			properties.remove(key);
			properties.put(key, value);
		}
		em = emf.createEntityManager(properties);
		return em;
	}

	private void checkAttributes() {
		if (emf == null || em == null) {
			emf = Persistence.createEntityManagerFactory(this.persistenceUnit);
			em = emf.createEntityManager();
		}
	}

	private void updateAttributes() {
		emf = Persistence.createEntityManagerFactory(this.persistenceUnit);
		em = emf.createEntityManager();
	}
}
