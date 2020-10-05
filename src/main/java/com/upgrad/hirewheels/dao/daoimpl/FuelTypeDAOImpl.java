//package com.upgrad.hirewheels.dao.daoimpl;
//
//import com.upgrad.hirewheels.dao.FuelTypeDAO;
//import com.upgrad.hirewheels.entities.FuelType;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//
//@Repository("fuelTypeDAO")
//public class FuelTypeDAOImpl implements FuelTypeDAO {
//
//    @Autowired
//    EntityManagerFactory entityManagerFactory;
//
//    @Override
//    public FuelType saveFuelType(FuelType fuelType) {
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        entityManager.getTransaction().begin();
//        entityManager.persist(fuelType);
//        entityManager.getTransaction().commit();
//        entityManager.close();
//        return fuelType;
//    }
//}
