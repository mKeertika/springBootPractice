package org.percholas.SpringSubProject;
import org.percholas.SpringSubProject.model.User;
import org.percholas.SpringSubProject.repositories.IUserRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Optional;


@SpringBootApplication
public class SpringSubProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSubProjectApplication.class, args);
			}


//	@Bean
//	public CommandLineRunner commandLineRunner() {
//
//		CommandLineRunner commandLineRunner = args -> System.out.println("this is my 1st commandline runner");
//		return commandLineRunner();
//	}
//
//	@Bean
//	public CommandLineRunner commandLineRunner1(IUserRepo userRepo){
//		return new CommandLineRunner() {
//			@Override
//			public void run(String... args) throws Exception {
//				User employee1 = new User();
//				employee1.setEmail("sang@gmail.com");
//				employee1.setFullName("sang sing");
//				IUserRepo.save(employee1);
//				Optional<User> optionalEmployee = IUserRepo.findById(1L);
//				if (optionalEmployee.isPresent()) {
//					User employee = optionalEmployee.get();
//					System.out.println("Employee = " + employee.getFullName());
//				}
//			}
//		};
//	}
}

