package ar.com.educacionit.ws.services;

import ar.com.educacionit.ws.domain.User;
import ar.com.educacionit.ws.exceptions.ServiceException;

public interface UserService {

	public User getUserByUserName(String username) throws ServiceException;  
}
