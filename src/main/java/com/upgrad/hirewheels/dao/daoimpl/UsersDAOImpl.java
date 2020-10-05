//package com.upgrad.hirewheels.dao.daoimpl;
//
//import com.upgrad.hirewheels.dao.UsersDAO;
//import com.upgrad.hirewheels.entities.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.NoResultException;
//import javax.transaction.Transactional;
//import java.util.List;
//
//@Repository("userDAO")
//public class UsersDAOImpl implements UsersDAO {
//
//    @Autowired
//    EntityManagerFactory entityManagerFactory;
//
//    @Transactional
//    @Override
//    public User createUser(User user) {
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        entityManager.getTransaction().begin();
//        entityManager.persist(user);
//        entityManager.getTransaction().commit();
//        entityManager.close();
//        return user;
//    }
//
//    @Override
//    public List<User> fetchAll() {
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        entityManager.getTransaction().begin();
//        entityManager.getTransaction().commit();
//        entityManager.close();
//        return null;
//    }
//
//    @Override
//    public User fetchUserByEmail(String email) {
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        entityManager.getTransaction().begin();
//        String sql = "FROM User WHERE email = :email";
//        User user = null;
//        try {
//            user = (User) entityManager.createQuery(sql, User.class).setParameter("email", email).getSingleResult();
//        } catch(NoResultException ignored) { }
//
//        entityManager.getTransaction().commit();
//        entityManager.close();
//        return user;
//    }
//
//    @Override
//    public User fetchUserByMobileNo(String mobileNo) {
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        entityManager.getTransaction().begin();
//        String sql = "FROM User WHERE mobile_no = :mobile_no";
//        User user = null;
//        try {
//            user = (User) entityManager.createQuery(sql, User.class).setParameter("mobile_no", mobileNo).getSingleResult();
//        } catch (NoResultException ignored) {}
//
//        entityManager.getTransaction().commit();
//        entityManager.close();
//        return user;
//    }
//}
