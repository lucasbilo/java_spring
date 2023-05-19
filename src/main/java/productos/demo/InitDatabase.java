package productos.demo;

import productos.demo.model.Product;
import productos.demo.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitDatabase {

    @Bean
    CommandLineRunner InitDatabase(ProductService service) {
        return args -> {
            service.createProduct(new Product("Product 1", "Description 1", 10.0, 100));
            service.createProduct(new Product("Product 2", "Description 2", 20.0, 200));
            service.createProduct(new Product("Product 3", "Description 3", 30.0, 300));
            service.createProduct(new Product("Product 4", "Description 4", 40.0, 400));
            service.createProduct(new Product("Product 5", "Description 5", 50.0, 500));
        };
    }
}
