package blablacar.services;

import blablacar.domain.Ride;
import blablacar.domain.User;
import blablacar.repository.RideRepository;
import blablacar.repository.UserRepository;

import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	@Autowired
	RideRepository rideRepository;
	
	public void save(User user) {
		userRepository.save(user);
	}
	
    @Transactional
    public void addRide(int userId, int rideId) {
    User user = userRepository.findOne(userId);
    Ride ride = rideRepository.findOne(rideId);
    user.getProposedRides().add(ride);
    ride.setUserWhoProposed(user);
    userRepository.save(user);
    }

	public UserRepository getUserDao() {
		return userRepository;
	}
	public void setUserDao(UserRepository userDao) {
		this.userRepository = userDao;
	}

}
