//package com.upgrad.hirewheels.dao.daoimpl;
//
//import com.upgrad.hirewheels.dao.VehicleSubCategoryDAO;
//import com.upgrad.hirewheels.entities.VehicleCategory;
//import com.upgrad.hirewheels.entities.VehicleSubCategory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Service;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//
//@Repository("vehicleSubCategoryDAO")
//public class VehicleSubCategoryDAOImpl implements VehicleSubCategoryDAO {
//    @Autowired
//    EntityManagerFactory entityManagerFactory;
//    @Override
//    public VehicleSubCategory saveVehicleSubCategory(VehicleSubCategory vehicleSubCategory) {
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        entityManager.getTransaction().begin();
//        entityManager.persist(vehicleSubCategory);
//        entityManager.getTransaction().commit();
//        return vehicleSubCategory;
//    }
//}
