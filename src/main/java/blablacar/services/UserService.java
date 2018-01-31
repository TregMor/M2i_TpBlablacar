package blablacar.services;

import blablacar.domain.User;
import blablacar.repository.UserRepository;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class UserService {

	@Autowired
	UserRepository userDao;
	
	public void signup(User user) {
		userDao.save(user);
	}

	public UserRepository getUserDao() {
		return userDao;
	}
	public void setUserDao(UserRepository userDao) {
		this.userDao = userDao;
	}

}
