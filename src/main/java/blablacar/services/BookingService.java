package blablacar.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import blablacar.domain.Booking;
import blablacar.domain.Ride;
import blablacar.domain.User;
import blablacar.repository.BookingRepository;
import blablacar.repository.RideRepository;
import blablacar.repository.UserRepository;

@Service
public class BookingService {

    @Autowired
    RideRepository rideRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    BookingRepository bookingRepository;

    public Booking bookARide(int userId, int rideId) { //throws RideIsFullBusinessException 
        Booking booking = null;
        User user = userRepository.findOne(userId);
        Ride ride = rideRepository.findOne(rideId);

        if (ride.getSeats() > 0) {
            ride.setSeats((short) (ride.getSeats() - 1));
            System.out.println("-*-*-*-Et là  on passe ds le BookingService -*-*-*-*-");
            booking = new Booking();
            booking.setUser(user);
            booking.setRide(ride);
            bookingRepository.save(booking);
//        } else {
//            throw new RideIsFullBusinessException("plus de places");
        }
        return booking;
    }
}