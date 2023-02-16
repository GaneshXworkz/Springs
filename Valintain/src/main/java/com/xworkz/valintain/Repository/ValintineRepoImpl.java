package com.xworkz.valintain.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.valintain.dto.Entity.ValintineEntityDto;

@Repository
public class ValintineRepoImpl implements ValintineRepo{

	@Autowired
	public EntityManagerFactory entityManagerFactory;
	
	
	public ValintineRepoImpl() {
		System.out.println("created :"+this.getClass().getSimpleName());
	}


	@Override
	public boolean save(ValintineEntityDto dto) {
		System.out.println("Save method is running");
		
		EntityManager entityManager=this.entityManagerFactory.createEntityManager();
		
		EntityTransaction transaction=entityManager.getTransaction();
		
		transaction.begin();
		
		entityManager.persist(dto);
		
		transaction.commit();
		
		entityManager.close();
		
		return false;
	}
	
	
	
	
	
}
