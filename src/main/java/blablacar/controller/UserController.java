package blablacar.controller;

import java.io.Serializable;

import blablacar.domain.User;

public class UserController implements Serializable {
	
		private static final long serialVersionUID = 1L;

		private User user;

		//private UserDao userDao;

		public UserController() {
			user = new User();
		}

//		public List<User> list() {
//			return userDao.list();
//		}


}
