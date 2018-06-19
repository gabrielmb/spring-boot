package br.com.gabriel.springRest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gabriel.springRest.model.User;
import br.com.gabriel.springRest.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public String addNewUser(User user) {

		return "Saved";
	}

	public List<User> findAll() {
		return userRepository.findAll();
	}

	public void save(User user) {

	userRepository.save( user );
    }

}
