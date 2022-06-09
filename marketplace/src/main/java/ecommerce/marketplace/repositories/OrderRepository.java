package ecommerce.marketplace.repositories;

import ecommerce.marketplace.models.customerorder.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<CustomerOrder, Long> {
}
