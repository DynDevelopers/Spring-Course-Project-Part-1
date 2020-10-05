//package com.upgrad.hirewheels.dao.daoimpl;
//
//import com.upgrad.hirewheels.dao.BookingDAO;
//import com.upgrad.hirewheels.entities.Booking;
//import com.upgrad.hirewheels.entities.User;
//import com.upgrad.hirewheels.exceptions.InsufficientBalanceException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//
//@Repository("bookingDAO")
//public class BookingDAOImpl implements BookingDAO {
//
//    @Autowired
//    EntityManagerFactory entityManagerFactory;
//
//    @Override
//    public Booking addBooking(Booking booking) throws InsufficientBalanceException {
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        entityManager.getTransaction().begin();
//        User user = booking.getUser();
//        if ((user.getWalletMoney()-booking.getAmount()) < 0)
//            throw new InsufficientBalanceException("Insufficient Balance. Please Check With Admin");
//        user.setWalletMoney(user.getWalletMoney()-booking.getAmount());
//        entityManager.merge(user);
//        entityManager.persist(booking);
//        entityManager.getTransaction().commit();
//        entityManager.close();
//        return booking;
//    }
//}
