package blablacar.controller;

import blablacar.domain.User;
import blablacar.repository.UserRepository;
import blablacar.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("{id}")
	public User find(@PathVariable("id") Integer userId) {
		return userRepository.findOne(userId); 
	}
	
	@GetMapping
	public Iterable<User> findAll() {
		return userRepository.findAll();
	}
	
	@PostMapping
	public void signup(@RequestBody User user) {
		System.out.println("signup | user: " + user);
		userService.signup(user);
	}
	
	@PostMapping("{userId}/{rideId}")
	public void addRide(@PathVariable("userId") Integer userId, @PathVariable("rideId") Integer rideId) {
		System.out.println("signup | user: " + userId + "ride: " + rideId);
		//userService.signup(user);
	}

	// Getters-Setters ajoutés ds le doute...
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public UserRepository getUserRepository() {
		return userRepository;
	}
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
}
