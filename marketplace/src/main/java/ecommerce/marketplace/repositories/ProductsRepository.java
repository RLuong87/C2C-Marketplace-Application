package ecommerce.marketplace.repositories;

import ecommerce.marketplace.models.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products, Long> {
}
