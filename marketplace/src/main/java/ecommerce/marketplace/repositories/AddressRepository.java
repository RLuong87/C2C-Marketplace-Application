package ecommerce.marketplace.repositories;

import ecommerce.marketplace.models.address.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
