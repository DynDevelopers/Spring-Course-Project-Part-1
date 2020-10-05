//package com.upgrad.hirewheels.dao.daoimpl;
//
//import com.upgrad.hirewheels.dao.RoleDAO;
//import com.upgrad.hirewheels.entities.Role;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//
//@Repository("roleDAO")
//public class RoleDAOImpl implements RoleDAO {
//
//    @Autowired
//    EntityManagerFactory entityManagerFactory;
//
//    @Override
//    public Role saveRole(Role role) {
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        entityManager.getTransaction().begin();
//        entityManager.persist(role);
//        entityManager.getTransaction().commit();
//        return role;
//    }
//}
