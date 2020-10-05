//package com.upgrad.hirewheels.dao.daoimpl;
//
//import com.upgrad.hirewheels.dao.VehicleDAO;
//import com.upgrad.hirewheels.entities.Vehicle;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import java.util.List;
//
//@Repository("vehicleDAO")
//public class VehicleDAOImpl implements VehicleDAO {
//
//    @Autowired
//    private EntityManagerFactory entityManagerFactory;
//
//    @Override
//    public Vehicle saveVehicle(Vehicle vehicle) {
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        entityManager.getTransaction().begin();
//        entityManager.persist(vehicle);
//        entityManager.getTransaction().commit();
//        entityManager.close();
//        return vehicle;
//    }
//
//    @Override
//    public Vehicle findVehicleById(int id) {
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        entityManager.getTransaction().begin();
//        Vehicle vehicle = entityManager.find(Vehicle.class, id);
//        entityManager.getTransaction().commit();
//        entityManager.close();
//        return vehicle;
//    }
//
//    public List<Vehicle> fetchAllVehicle() {
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        entityManager.getTransaction().begin();
//        List<Vehicle> vehicles = entityManager.createQuery("SELECT v FROM Vehicle v", Vehicle.class).getResultList();
//        entityManager.getTransaction().commit();
//        entityManager.close();
//        return vehicles;
//    }
//
//    @Override
//    public Vehicle changeAvailability(int id, int availability_status) {
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        entityManager.getTransaction().begin();
//        Vehicle vehicle = findVehicleById(id);
//        vehicle.setAvailabilityStatus(availability_status);
//        entityManager.merge(vehicle);
//        entityManager.getTransaction().commit();
//        entityManager.close();
//        return vehicle;
//    }
//
//    @Override
//    public List<Vehicle> fetchAvailableVehicles() {
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        entityManager.getTransaction().begin();
//        List<Vehicle> vehicles = entityManager.createQuery("SELECT v FROM Vehicle v where v.availabilityStatus = 1", Vehicle.class).getResultList();
//        System.out.println(vehicles.size());
//        entityManager.getTransaction().commit();
//        entityManager.close();
//        return vehicles;
//    }
//}
