package ar.com.educacionit.ws.services.impl;

import ar.com.educacionit.ws.domain.User;
import ar.com.educacionit.ws.exceptions.GenericExeption;
import ar.com.educacionit.ws.exceptions.ServiceException;
import ar.com.educacionit.ws.repository.UserRepository;
import ar.com.educacionit.ws.repository.impl.UserRepositoryHibImpl;
import ar.com.educacionit.ws.services.UserService;

public class UserServiceImpl implements UserService {

	//usar la interfaz UserRepository
	private UserRepository userRepository;
	
	public UserServiceImpl() {
		this.userRepository = new UserRepositoryHibImpl();
	}
	
	public User getUserByUserName(String username) throws ServiceException {
		
		try {
			return this.userRepository.getUser(username);
		} catch (GenericExeption e) {
			throw new ServiceException(e.getMessage(), e);
		}
	}

}
