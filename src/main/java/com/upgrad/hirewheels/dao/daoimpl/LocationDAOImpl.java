//package com.upgrad.hirewheels.dao.daoimpl;
//
//import com.upgrad.hirewheels.dao.LocationDAO;
//import com.upgrad.hirewheels.entities.Location;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//
//@Repository("locationDAO")
//public class LocationDAOImpl implements LocationDAO {
//
//    @Autowired
//    EntityManagerFactory entityManagerFactory;
//
//    @Override
//    public Location saveLocation(Location location) {
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        entityManager.getTransaction().begin();
//        entityManager.persist(location);
//        entityManager.getTransaction().commit();
//        entityManager.close();
//        return location;
//    }
//}
