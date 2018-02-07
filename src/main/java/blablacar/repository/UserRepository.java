package blablacar.repository;

//import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import blablacar.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
	//public List<User> findAllByFirstName(String firstName) ;
	
	public User findByLogin(String Login);

	public static User findOne(User userWhoProposed) {
		return null;
	}
}