package DIO.productcatalog.controller;

import DIO.productcatalog.model.Product;
import DIO.productcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class ProductController {
    @Autowired
    ProductRepository productRepository;

    @PostMapping
    Product create(Product product) {
       return productRepository.save(product);
    }

    @GetMapping("/{id}")
    Optional<Product> findById(@PathVariable Integer id){
        return productRepository.findById(id);
    }
}


