package com.Spring.SpringJPA;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.Spring.SpringJPA.entity.User;
import com.Spring.SpringJPA.service.UserDAOService;

@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner {
	
	private static final Logger log = LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class);
	@Autowired
	private UserDAOService userDAOService;
	
	@Override
	public void run(String... args)throws Exception {
		
		User user =  new User("Alex", "Admin");
		//User user = new User("William", "Developer");
		long insert=userDAOService.insert(user);
		
		log.info("New User is created" + user);
		
	}
	

}
