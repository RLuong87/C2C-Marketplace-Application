package ecommerce.marketplace.controllers;

import ecommerce.marketplace.models.customerorder.CustomerOrder;
import ecommerce.marketplace.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@CrossOrigin
@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    public OrderRepository orderRepository;

    @GetMapping
    public ResponseEntity<Iterable<CustomerOrder>> getAllOrders() {
        return new ResponseEntity<>(orderRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public CustomerOrder getById(@PathVariable Long id) {
        return orderRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<CustomerOrder> createOrder(@RequestBody CustomerOrder order) {

        return new ResponseEntity<>(orderRepository.save(order), HttpStatus.CREATED);
    }

}
