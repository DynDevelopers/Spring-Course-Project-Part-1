//package com.upgrad.hirewheels.dao.daoimpl;
//
//import com.upgrad.hirewheels.dao.CityDAO;
//import com.upgrad.hirewheels.entities.City;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//
//@Repository("cityDAO")
//public class CityDAOImpl implements CityDAO {
//
//    @Autowired
//    EntityManagerFactory entityManagerFactory;
//
//    @Override
//    public City saveCity(City city) {
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        entityManager.getTransaction().begin();
//        entityManager.persist(city);
//        entityManager.getTransaction().commit();
//        entityManager.close();
//        return city;
//    }
//}
