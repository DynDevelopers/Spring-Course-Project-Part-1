//package com.upgrad.hirewheels.dao.daoimpl;
//
//import com.upgrad.hirewheels.dao.VehicleCategoryDAO;
//import com.upgrad.hirewheels.entities.VehicleCategory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//
//@Repository("vehicleCategoryDAO")
//public class VehicleCategoryDAOImpl implements VehicleCategoryDAO {
//
//    @Autowired
//    EntityManagerFactory entityManagerFactory;
//    @Override
//    public VehicleCategory saveVehicleCategory(VehicleCategory vehicleCategory) {
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        entityManager.getTransaction().begin();
//        entityManager.persist(vehicleCategory);
//        entityManager.getTransaction().commit();
//        return vehicleCategory;
//    }
//}
