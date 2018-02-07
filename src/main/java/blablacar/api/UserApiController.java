package blablacar.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import blablacar.domain.User;
import blablacar.repository.RideRepository;
import blablacar.repository.UserRepository;
import blablacar.services.UserService;

@RestController
@RequestMapping("/user")
public class UserApiController {
	
	@Autowired
	UserService userService;
	@Autowired
	UserRepository userRepository;
	@Autowired
	RideRepository rideRepository;
	
	@GetMapping("{id}")
	public User find(@PathVariable("id") Integer userId) {
		return userRepository.findOne(userId); 
	}
	
	@GetMapping
	public Iterable<User> findAll() {
		return userRepository.findAll();
	}
	
	
	@PostMapping
	public void save(@RequestBody User user) {
		System.out.println("save | user: " + user);
		userService.save(user);
	}
	
    @PostMapping("{userId}/{rideId}")
    public void addRide(@PathVariable("userId") int userId, @PathVariable("rideId") int rideId) {
        userService.addRide(userId, rideId);
    }

	// Getters-Setters ajoutés ds le doute...
//	public UserService getUserService() {
//		return userService;
//	}
//	public void setUserService(UserService userService) {
//		this.userService = userService;
//	}
//	public UserRepository getUserRepository() {
//		return userRepository;
//	}
//	public void setUserRepository(UserRepository userRepository) {
//		this.userRepository = userRepository;
//	}
//	public RideRepository getRideRepository() {
//	return rideRepository;
//}
//public void setRideRepository(RideRepository rideRepository) {
//	this.rideRepository = rideRepository;
//}
}
