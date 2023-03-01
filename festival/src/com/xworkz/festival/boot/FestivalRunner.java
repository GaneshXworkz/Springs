package com.xworkz.festival.boot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.festival.entity.FestivalEntity;

public class FestivalRunner {
	
	public static void main(String[] args) {
		
		System.out.println("Running In Persist Runner");
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.xworkz.fest");
		EntityManager entityManager=factory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		
		transaction.begin();
		FestivalEntity entity=new FestivalEntity("Holi", "hindu", 2, "Sahavage", "HolikaSamhara");
		entityManager.persist(entity);
		transaction.commit();
		entityManager.close();
		
	

	}

}
