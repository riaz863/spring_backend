package net.javaguides.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.EmployeeRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception 
	{
//		Employee employee1=new Employee();
//		employee1.setFirstName("riaz");
//		employee1.setLastName("mohamed");		
//		employee1.setEmailId("riaz@gmail.com");
//		employeeRepository.save(employee1);
//		
//		Employee employee2=new Employee();
//		employee2.setFirstName("leo");
//		employee2.setLastName("ahamed");		
//		employee2.setEmailId("leo@gmail.com");
//		employeeRepository.save(employee2);

	}

}
