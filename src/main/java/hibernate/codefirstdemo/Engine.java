package hibernate.codefirstdemo;

import javax.persistence.EntityManager;

public class Engine implements Runnable {

	private final EntityManager entityManager;

	public Engine(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public void run() {

	}

}
