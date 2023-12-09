package com.jsp.libraryDao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.libraryDto.Admin;

public class AdminDao {
	
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
EntityManager entityManager=entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction=entityManager.getTransaction();

public Admin saveAdmin(Admin admin) {
	entityTransaction.begin();
	entityManager.persist(admin);
	entityTransaction.commit();
	
	return admin;
}

public Admin deleteAdminById(int id) {
	Admin admin=entityManager.find(Admin.class, id);
	
	if(admin !=null) {
		entityTransaction.begin();
		entityManager.remove(admin);
		entityTransaction.commit();
	}
	else {
		System.out.println("Not Deleted");
	}
	return admin;
}

public Admin updateUsernameById(int id,String username) {
	Admin admin=entityManager.find(Admin.class, id);
	admin.setUsername(username);
	
	if(admin!=null) {
		entityTransaction.begin();
		entityManager.merge(admin);
		entityTransaction.commit();
		
	}
	return admin;
}

public Admin updatePasswordById(int id,String newpassword) {
	Admin admin=entityManager.find(Admin.class, id);
	admin.setPassword(newpassword);
	
	if(admin!=null) {
		entityTransaction.begin();
		entityManager.merge(admin);
		entityTransaction.commit();
		
	}
	return admin;
}

public Admin getAdminById(int id) {
	Admin admin=entityManager.find(Admin.class, id);
	System.out.println("==========================");
	System.out.println(admin.getId()+" ");
	System.out.println(admin.getName()+" ");
	System.out.println(admin.getUsername()+" ");
	System.out.println(admin.getPassword()+" ");
	System.out.println("==========================");
	return admin;

}

public List<Admin> getAllAdmins(){
	String sql="SELECT a FROM Admin a";
	Query query=entityManager.createQuery(sql);
	List<Admin> admins=query.getResultList();
	for(Admin a:admins) {
		System.out.println("==========================");
		System.out.println(a.getId()+" ");
		System.out.println(a.getName()+" ");
		System.out.println(a.getUsername()+" ");
		System.out.println(a.getPassword()+" ");
		System.out.println("==========================");
	}
	return admins;
}
}


















