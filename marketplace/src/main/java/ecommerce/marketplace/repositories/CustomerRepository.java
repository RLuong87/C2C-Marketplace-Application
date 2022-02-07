package ecommerce.marketplace.repositories;

import ecommerce.marketplace.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
