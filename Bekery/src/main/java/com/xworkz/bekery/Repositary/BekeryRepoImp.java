package com.xworkz.bekery.Repositary;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.bekery.dto.BekaryDTO;

@Repository
public class BekeryRepoImp implements BekeryRepositery {

	//private static final String entityMangerfactory = null;
    @Autowired
	 public EntityManagerFactory entityManagerFactory;
	

	public BekeryRepoImp() {
		System.out.println("created :"+this.getClass().getSimpleName());
	}
	
	
	@Override
	public boolean save(BekaryDTO dto) {
	System.out.println("Running save....");	
	
	EntityManager entityManager =this.entityManagerFactory.createEntityManager();
	EntityTransaction tranction=entityManager.getTransaction();
	tranction.begin();
	entityManager.persist(dto);
	tranction.commit();
	entityManager.close();
		return false;
	}
	
}
