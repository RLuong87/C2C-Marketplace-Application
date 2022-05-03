package ecommerce.marketplace.repositories;

import ecommerce.marketplace.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
