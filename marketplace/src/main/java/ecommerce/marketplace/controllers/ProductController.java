package ecommerce.marketplace.controllers;

import ecommerce.marketplace.models.product.Product;
import ecommerce.marketplace.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@CrossOrigin
@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public ResponseEntity<Iterable<Product>> getProducts() {
        return new ResponseEntity<>(productRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        return new ResponseEntity<>(productRepository.save(product), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public @ResponseBody Product updateProduct(@PathVariable Long id, @RequestBody Product updates) {

        Product product = productRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        if (updates.getProductName() != null) product.setProductName(updates.getProductName());
        if (updates.getPrice() != null) product.setPrice(updates.getPrice());
        if (updates.getPrice() != null) product.setPrice(updates.getPrice());
        if (updates.getCategory() != null) product.setCategory(updates.getCategory());
        if (updates.getDepartment() != null) product.setDepartment(updates.getDepartment());

        return productRepository.save(product);
    }
}
