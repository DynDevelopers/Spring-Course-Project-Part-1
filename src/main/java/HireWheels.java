import com.upgrad.hirewheels.dao.UsersDAO;
import com.upgrad.hirewheels.entities.*;
import com.upgrad.hirewheels.exceptions.UserAlreadyExistsException;
import com.upgrad.hirewheels.services.*;
import com.upgrad.hirewheels.services.serviceimpl.VehicleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.List;

public class HireWheels {



    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        InitService initService = (InitService) applicationContext.getBean("initService");
        AdminService adminService = (AdminService) applicationContext.getBean("adminService");
        BookingService bookingService = (BookingService) applicationContext.getBean("bookingService");

        initService.populateRole();
        initService.populateUserAdmin();
        initService.populateCity();
        initService.populateLocation();
        initService.populateFuelType();
        initService.populateVehicleCategory();
        initService.populateVehicleSubCategory();

        UserService userService = (UserService) applicationContext.getBean("userService");

        User user = new User();
        user.setFirstName("Deep");
        user.setLastName("Nevgi");
        user.setPassword("123456789");
        user.setEmail("deep.nevgi@mail.com");
        user.setMobileNo("8989878989");

        Role userRole = new Role();
        userRole.setRoleId(2);
        userRole.setRoleName("USER");
        user.setWalletMoney(1000);

        user.setRole(userRole);


        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleModel("2012");
        vehicle.setVehicleNumber("MH12");

        VehicleSubCategory vehicleSubCategory = new VehicleSubCategory();
        vehicleSubCategory.setVehicleSubcategoryId(4);
        vehicleSubCategory.setVehicleSubcategoryName("CRUISER");
        vehicleSubCategory.setPricePerDay(200);


        VehicleCategory category = new VehicleCategory();
        category.setVehicleCategoryId(10);
        category.setVehicleCategoryName("Car");

        vehicleSubCategory.setVehicleCategory(category);

        vehicle.setAvailabilityStatus(1);
        vehicle.setColor("RED");
        vehicle.setVehicleSubCategory(vehicleSubCategory);
        FuelType fuelType = new FuelType();
        fuelType.setFuelTypeId(1);
        fuelType.setFuelType("Petrol");

        vehicle.setFuelType(fuelType);

        Location location = new Location();

        location.setLocationId(1);
        location.setLocationName("Worli");
        location.setAddress("Dr E Moses Rd, Worli Naka, Upper Worli");

        City city = new City();
        city.setCityId(1);
        city.setCityName("Mumbai");

        location.setCity(city);

        location.setPincode("400018");
        vehicle.setLocation(location);
        vehicle.setAvailabilityStatus(1);

        vehicle.setVehicleImageUrl("http://my.com/vehicle.jpg");

        Booking booking = new Booking();
        booking.setUser(user);
        booking.setLocation(location);
        booking.setAmount(vehicleSubCategory.getPricePerDay());
        booking.setVehicle(vehicle);
        booking.setBookingDate(new Date());
        booking.setPickupDate(LocalDate.of(2020, Month.NOVEMBER, 1));
        booking.setDropoffDate(LocalDate.of(2020, Month.NOVEMBER, 1));

        VehicleService vehicleService = (VehicleService) applicationContext.getBean("vehicleService");
        try {
            userService.createUser(user);
            System.out.println(userService.getUser("deep.nevgi@mail.com", "123456789").toString());
            Vehicle vehicle1 = adminService.registerVehicle(vehicle);
            adminService.changeAvailability(vehicle1.getVehicleId(), 0);
            bookingService.addBooking(booking);

            vehicleService.getAllVehicles().forEach(System.out::println);
            vehicleService.getAvailableVehicles().forEach(System.out::println);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
