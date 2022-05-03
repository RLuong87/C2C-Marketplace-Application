package ecommerce.marketplace.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class CustomerOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;

//    @OneToMany
//    @JoinColumn(name = "product_id", referencedColumnName = "id")
//    private List<Product> product;

    private String qty;

    public CustomerOrder(Customer customer, String qty) {
        this.customer = customer;
        this.qty = qty;
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

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

//    public List<Product> getProduct() {
//        return product;
//    }
//
//    public void setProduct(List<Product> product) {
//        this.product = product;
//    }
}
