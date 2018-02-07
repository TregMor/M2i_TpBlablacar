package blablacar.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import blablacar.domain.Booking;
import blablacar.domain.Ride;
import blablacar.domain.User;
import blablacar.repository.BookingRepository;
import blablacar.repository.RideRepository;
import blablacar.repository.UserRepository;

@RestController
@RequestMapping("/booking")
public class BookingApiController {
	
	@Autowired
	UserRepository userRepository;
	@Autowired
	RideRepository rideRepository;
	@Autowired
	BookingRepository bookingRepository;
	
	@GetMapping
	public Iterable<Booking> list(){
		return bookingRepository.findAll();
	}
	
	@PostMapping("{userId}/{rideId}")
	public void save(@PathVariable("userId") int userId, @PathVariable("rideId") int rideId) {
		User user = userRepository.findOne(userId);
		Ride ride = rideRepository.findOne(rideId);	
		
		Booking booking = new Booking();
		booking.setUser(user);
		booking.setRide(ride);
		bookingRepository.save(booking);
	}
}