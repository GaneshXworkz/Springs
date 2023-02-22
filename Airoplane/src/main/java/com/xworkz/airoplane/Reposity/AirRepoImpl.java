package com.xworkz.airoplane.Reposity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.airoplane.EntityDto.AiroplaneEntityDto;

@Repository
public class AirRepoImpl implements AirRepo{

	
	@Autowired
	public EntityManagerFactory entityManagerFactory;
	
	public AirRepoImpl() {
		System.out.println("Creating AirRepoImpl");
	}
	
	
	
	@Override
	public boolean save(AiroplaneEntityDto entity) {
		
		System.out.println("Running save....");
		
		EntityManager entityManager =this.entityManagerFactory.createEntityManager();
		
		EntityTransaction transaction=entityManager.getTransaction();
		
		transaction.begin();
		
		entityManager.persist(entity);
		
		transaction.commit();
		
		entityManager.close();
		
		return false;
	}
	
	
	
	@Override
	public AiroplaneEntityDto findById(int id) {
		System.out.println("find Id in repo.."+id);
		
		EntityManager entityManager=this.entityManagerFactory.createEntityManager();
		
		AiroplaneEntityDto airoplaneEntityDto=entityManager.find(AiroplaneEntityDto.class, id);
		
		entityManager.close();
		
		return airoplaneEntityDto;
	}

}
