package com.Spring.SpringJPA;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.Spring.SpringJPA.entity.User;
import com.Spring.SpringJPA.service.UserDAOService;
import com.Spring.SpringJPA.service.UserRepository;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {
	
	private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args)throws Exception {
		
		User user =  new User("William", "SysAdmin");
		
		userRepository.save(user);
		
		log.info("New User is created: " + user);
		
		List<User> users = userRepository.findAll();
		log.info("List of all users are retrived: "+users);
		
		Optional<User> userWithIdOne =userRepository.findById((int) 1L);
		
		log.info("User retrived by id: "+userWithIdOne);
		
		
		
	}
	

}
