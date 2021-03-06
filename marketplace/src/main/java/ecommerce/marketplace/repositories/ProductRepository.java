package ecommerce.marketplace.repositories;

import ecommerce.marketplace.models.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
