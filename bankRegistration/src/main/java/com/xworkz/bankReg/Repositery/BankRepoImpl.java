package com.xworkz.bankReg.Repositery;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.transaction.Transaction;

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
		
		return true;
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
	public List<EntityDto> findByName(String name)
	{
		System.out.println("Running entity method:"+name);
		
	EntityManager entityManager	=this.entityManagerFactory.createEntityManager();
	try {
		
       Query query = entityManager.createNamedQuery("findByName");
       query.setParameter("nam", name);
       System.out.println("Quary :"+name);
       List<EntityDto> list =query.getResultList();
       System.out.println("Total list Found in repo :"+list.size());
		/* throw new IdNotFoundException; */
		return list;
       
	} /*
		 * catch (IdNotFoundException e) { System.out.println("ID NOT FOUND"); }
		 */
	finally {
		entityManager.close();
		System.out.println("Release the connection....");
	}
	
	
	}
    
    
	@Override
	public boolean update(EntityDto entity) {
	
	EntityManager manager=this.entityManagerFactory.createEntityManager();
	
	try {
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.merge(entity);
		transaction.commit();
		
		
		return true;	
	}finally {
		manager.close();
	}
	 	
		
	}


	@Override
	public boolean onDelete(int id) {
		 System.out.println("Delete method is running....");
	EntityManager manager= this.entityManagerFactory.createEntityManager();
	
	EntityTransaction entityTransaction=manager.getTransaction();
	EntityDto entityDto=manager.find(EntityDto.class, id);
	
		entityTransaction.begin();
		manager.remove(entityDto);
		entityTransaction.commit();
		manager.close();
	
	
	
	
	
		return true;
	}
	
	

}
