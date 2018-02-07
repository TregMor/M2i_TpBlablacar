package blablacar.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import blablacar.domain.Ride;
import blablacar.repository.RideRepository;

@RestController
@RequestMapping("/rideApi")
public class RideApiController {

	
	@Autowired
	private RideRepository rideRepository;
	
	@GetMapping("{idRide}")
	public Ride find(@PathVariable("idRide") Integer rideId) {
		return rideRepository.findOne(rideId); 
	}
	
	@GetMapping
	public Iterable<Ride> findAll() {
		return rideRepository.findAll();
	}
	 
	@PostMapping
	public void save(@RequestBody Ride ride) {
		System.out.println("save | ride: " + ride);
		rideRepository.save(ride);
	}
}