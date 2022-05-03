package ecommerce.marketplace.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    @JsonIgnore
    private Customer customer;

//    @ManyToOne
//    @JoinColumn(name = "product_id", referencedColumnName = "id")
//    private CustomerOrder customerOrder;

    private String productName;
    private String price;

    public Product() {
    }

    public Product(String productName, String price) {
        this.productName = productName;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

//    public CustomerOrder getCustomerOrder() {
//        return customerOrder;
//    }
//
//    public void setCustomerOrder(CustomerOrder customerOrder) {
//        this.customerOrder = customerOrder;
//    }
}
