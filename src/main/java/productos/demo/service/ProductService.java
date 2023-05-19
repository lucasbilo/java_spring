package productos.demo.service;

import productos.demo.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    Product createProduct(Product product);

    Product updateProduct(Long id, Product product);

    Optional<Product> getProductById(Long id);

    List<Product> getProductByName(String name);

    void deleteProduct(Long id);

    List<Product> getProductsSortedByPrice();
}
