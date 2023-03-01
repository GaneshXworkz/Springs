package com.xworkz.bankReg.Repositery;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.bankReg.EntityDto.EntityDto;
@Repository
public class BankRepoImpl implements BankRepo{

	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	public BankRepoImpl() {
		System.out.println("Created :"+this.getClass().getSimpleName());
			}
	
	
	@Override
	public boolean save(EntityDto entity) {
		System.out.println("Running save method.....!");
		
		EntityManager entityManager=this.entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		
		entityManager.persist(entity);
		
		entityTransaction.commit();
		
		entityManager.close();
		
		return false;
	}
	
	@Override
	public EntityDto findById(int id) {
		System.out.println("find Id in repo.."+id);
		
		EntityManager entityManager=this.entityManagerFactory.createEntityManager();
		
		EntityDto entityDto=entityManager.find(EntityDto.class,id);
		
		entityManager.close();
		
		return entityDto;
	}


	@Override
	public List<EntityDto> findByName(String name) {
		System.out.println("Running entity method:"+name);
	EntityManager entityManager	=this.entityManagerFactory.createEntityManager();
	try {
		
       Query query = entityManager.createNamedQuery("findByName");
       query.setParameter("nam", name);
       System.out.println("Quary :"+name);
       List<EntityDto> list =query.getResultList();
       System.out.println("Total list Found in repo :"+list.size());
        
		return list;
		}
	finally {
		entityManager.close();
		System.out.println("Release the connection....");
	}
	
	
	}
	

}
