package ecommerce.marketplace.models.customerorder;

import ecommerce.marketplace.models.product.Product;
import ecommerce.marketplace.models.customer.Customer;

import javax.persistence.*;
import java.util.List;

@Entity
public class CustomerOrder {

    /*
        Use local storage if a customer leaves and returns
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;

    public CustomerOrder(Customer customer, List<Product> product) {
        this.customer = customer;
    }

    public CustomerOrder() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
