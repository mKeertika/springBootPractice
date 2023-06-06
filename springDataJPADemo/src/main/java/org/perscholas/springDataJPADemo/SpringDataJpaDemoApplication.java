package org.perscholas.springDataJPADemo;

import org.perscholas.springDataJPADemo.entity.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.perscholas.springDataJPADemo.repository.StudentRepo;

@SpringBootApplication
public class SpringDataJpaDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringDataJpaDemoApplication.class, args);
//		StudentRepo studentRepo = applicationContext.getBean(StudentRepo.class);
//		Student student1 = new Student("kk", 23);
//		studentRepo.save(student1);

	}

}
