package com.webservice.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.webservice.course.entities.User;
import com.webservice.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//tudo que colocarmos dentro desse metodo sera executado quando a aplicação for iniciada
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
	
	//agora instanciamos um obj para ser mapeado no banco de dados

}
//essa classe serve para gente popular nosso banco de dados, que é o seeding database é um teste de envio de informações pro nosso bd local
//todo framework tem um mecanismo de injeção de dependecia implicito, ele é automatico