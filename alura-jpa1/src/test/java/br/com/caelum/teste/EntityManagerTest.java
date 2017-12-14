package br.com.caelum.teste;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.financas.modelo.PersistenceConstants;


public class EntityManagerTest {

	private static EntityManagerFactory emf;
	
	public static Map<String, String> getPropertiesHardCode(){
		Map<String,String> properties = new HashMap<String,String>();
//		properties.put("javax.persistence.provider", "org.hibernate.jpa.HibernatePersistenceProvider");
		properties.put("javax.persistence.provider", "org.hibernate.ejb.HibernatePersistence");
		properties.put(PersistenceConstants.JDBC_PASSWORD, "admin");
		properties.put(PersistenceConstants.JDBC_USER, "admin");
//		properties.put(PersistenceConstants.JDBC_URL, "jdbc:mysql://localhost:3306/mydb");
		properties.put(PersistenceConstants.JDBC_URL, "jdbc:h2:file:C:/apl/alura/h2/jpaDB");
		properties.put(PersistenceConstants.JDBC_DRIVER, "org.h2.Driver");
		return properties;
	}
	
	public static void initEntityManagerFactoryHardCode(){
//		PersistenceProvider persistenceProvider = new PersistenceProvider();
		
		emf = Persistence.createEntityManagerFactory("PersistUnitNameTest", getPropertiesHardCode());
	}
	public static void initEntityManagerConfigFile(){
		emf = Persistence.createEntityManagerFactory("financas");
	}
	
	public static void main(String[] args) {
		initEntityManagerConfigFile();
		EntityManager entityManager = emf.createEntityManager();
		
		
		
		entityManager.close();

	}

}
