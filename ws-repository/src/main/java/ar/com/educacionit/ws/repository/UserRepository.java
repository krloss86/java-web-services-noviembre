package ar.com.educacionit.ws.repository;

import ar.com.educacionit.ws.domain.User;
import ar.com.educacionit.ws.exceptions.GenericExeption;

public interface UserRepository {

	public User getUser(String username) throws GenericExeption;
}
