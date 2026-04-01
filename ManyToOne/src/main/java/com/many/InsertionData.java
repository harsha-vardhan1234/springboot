package com.many;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertionData {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("manytoone");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Phone p=new Phone();
		p.setId(1);
		p.setName("oppo");
		Sim s=new Sim();
		s.setId(1);
		s.setName("jio");
		s.setPh(p);
		Sim s1=new Sim();
		s1.setId(2);
		s1.setName("airtel");
		s1.setPh(p);
		et.begin();
		em.persist(p);
		em.persist(s);
		em.persist(s1);
		et.commit();
		System.out.println("done");

	}

}
