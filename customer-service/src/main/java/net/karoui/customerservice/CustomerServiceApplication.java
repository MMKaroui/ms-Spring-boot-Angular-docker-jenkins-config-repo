package net.karoui.customerservice;

import net.karoui.customerservice.config.GlobalConfig;
import net.karoui.customerservice.entities.Customer;
import net.karoui.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
@EnableConfigurationProperties(GlobalConfig.class)
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }
@Bean
    CommandLineRunner commandLineRunner (CustomerRepository customerRepository) {
        return args -> {
            List<Customer> customerList=List.of(
    Customer.builder()
         .fistName("Wassim")
         .lastName("Ben Mohamed")
         .email("wassim@gmail.com")
          .build(),
     Customer.builder()
       .fistName("Mohamed")
       .lastName("karoui")
       .email("Mohamed@gmail.com")
        .build() );
customerRepository.saveAll(customerList); }  ;
}
}
