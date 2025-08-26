package com.example;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@OpenAPIDefinition(info = @Info(title = "Employee Managing API", version = "1.0", description = "EMPLOYEE MANAGEMENT SYSTEM"))
public class EmployeeManagingApplication {

    public static void main(String[] args) {

        SpringApplication.run(EmployeeManagingApplication.class, args);
    }
    @Bean
    public CommandLineRunner initialData(EmployeeRepository employeeRepository) {
        return args -> {
            // Passing 'null' for the ID lets the database auto-generate it.
            employeeRepository.save(new Employee(null, "Trisha", 38089.00, "Noida"));
            employeeRepository.save(new Employee(null, "Pratyusha", 29089.00, "Pune"));
            employeeRepository.save(new Employee(null, "Pritam", 48089.00, "Kolkata"));
            employeeRepository.save(new Employee(null, "Anusree", 31300.00, "Chennai"));
            employeeRepository.save(new Employee(null, "Sumita", 26089.00, "Noida"));
            employeeRepository.save(new Employee(null, "Rishita", 29089.00, "Noida"));
            employeeRepository.save(new Employee(null, "Anusuta", 58089.00, "Pune"));
            employeeRepository.save(new Employee(null, "Arpita", 18090.00, "Kolkata"));
            employeeRepository.save(new Employee(null, "Arunima", 29089.00, "Bangalore"));
            employeeRepository.save(new Employee(null, "Mohit", 34089.00, "Gurgaon"));
        };
    }

}