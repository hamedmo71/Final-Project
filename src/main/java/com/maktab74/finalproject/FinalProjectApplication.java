package com.maktab74.finalproject;

import com.maktab74.finalproject.domain.user.Principal;
import com.maktab74.finalproject.domain.user.Teacher;
import com.maktab74.finalproject.repository.PrincipalRepository;
import com.maktab74.finalproject.repository.StudentRepository;
import com.maktab74.finalproject.repository.TeacherRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FinalProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FinalProjectApplication.class, args);
		PrincipalRepository principalRepository = context.getBean(PrincipalRepository.class);
		Principal principal=new Principal();
		principal.setFirstName("hamed");
		principal.setLastName("mohammadian");
		principal.setPassword("123");
		principal.setIsActive(true);
		principal.setUsername("hmo");

	}

}
