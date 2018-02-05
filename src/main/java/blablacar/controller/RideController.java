package blablacar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import blablacar.domain.Ride;
import blablacar.repository.RideRepository;
//import blablacar.rideService.RideService;

@RestController
@RequestMapping("/ride")
public class RideController {

	
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
		System.out.println("signup | ride: " + ride);
		rideRepository.save(ride);
	}
}