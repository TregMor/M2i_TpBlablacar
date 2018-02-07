package blablacar.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import blablacar.domain.Ride;
import blablacar.domain.User;
import blablacar.repository.RideRepository;
import blablacar.repository.UserRepository;

import java.util.Date;

@Service
public class RideService {
	
	@Autowired
	RideRepository rideRepository;
	@Autowired
    private UserRepository userRepository;
	
	public void create(Ride ride) {
		rideRepository.save(ride);		
	}
	
	public Ride offerARide(Date departureDate, String fromCity, String toCity, Double price, int seats, int userWhoProposed) {
		
		System.out.println("Passage ds le rideService");
		
		Ride ride = new Ride();
		ride.setDepartureDate(departureDate);
		ride.setFromCity(fromCity);
		ride.setToCity(toCity);
		ride.setPrice(price);
		ride.setSeats(seats);
		
		User user =userRepository.findOne(userWhoProposed);
		ride.setUserWhoProposed(user);
		rideRepository.save(ride);
		
		return ride;
	}
}
