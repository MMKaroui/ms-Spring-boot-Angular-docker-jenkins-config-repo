package net.karoui.customerservice.repository;

import net.karoui.customerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository <Customer, Long> {
}
