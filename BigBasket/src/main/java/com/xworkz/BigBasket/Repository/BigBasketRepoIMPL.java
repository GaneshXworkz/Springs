package com.xworkz.BigBasket.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.BigBasket.Entity.EntityBigBasketDTO;

@Repository
public class BigBasketRepoIMPL implements BigBasketRepo{

	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	public BigBasketRepoIMPL() {
		System.out.println("created..."+this.getClass().getSimpleName());
	}
	
	@Override
	public boolean save(EntityBigBasketDTO entity) {
	System.out.println("Running save...Method");
	
	EntityManager entityManager=this.entityManagerFactory.createEntityManager();
	
	EntityTransaction transaction=entityManager.getTransaction();
	
	transaction.begin();
	
	entityManager.persist(entity);
	
	transaction.commit();
	
	entityManager.close();
	
		return false;
	}

	
}
