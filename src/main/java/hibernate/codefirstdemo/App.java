package hibernate.codefirstdemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("CodeFirstDb");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		Runnable engine = new Engine(entityManager);
//		engine.run();

	}
}
