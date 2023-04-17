package com.carlos.estudo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.carlos.estudo.entities.User;
import com.carlos.estudo.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Jéssica Brown", "jeh@email.com", "98987787", "123456");
		User u2 = new User(null, "Sebastião Green", "seba@email.com", "9897867", "123456");
		User u3 = new User(null, "Abigaiul Blue", "abi@email.com", "897897894", "123456");
		User u4 = new User(null, "Water white", "ww@email.com", "98789756213", "123456");
		User u5 = new User(null, "Jonatan Red", "Jonas@email.com", "654897899", "123456");
		User u6 = new User(null, "Jony Black", "jow@email.com", "898989564", "123456");
		User u7 = new User(null, "Cristian Gray", "cris@email.com", "97897465416", "123456");	
		
		userRepository.saveAll(Arrays.asList(u1, u2, u3, u4, u5, u6, u7));
	}
}
