package com.xworkz.Egg.EggmenuRepo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Repository;

import com.xworkz.Egg.dto.EggMenuDto;

@Repository
public class EggMenuRepoImpliment implements EggMenuRepo {
	

	//private LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean;

	@Autowired
	public EntityManagerFactory entityManagerFactory;

	public EggMenuRepoImpliment() {
		System.out.println("Create :" + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(EggMenuDto dto) {
		System.out.println("Running save....");

		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		EntityTransaction tranction = entityManager.getTransaction();
		tranction.begin();
		entityManager.persist(dto);
		tranction.commit();
		entityManager.close();

		return false;
	}

}
