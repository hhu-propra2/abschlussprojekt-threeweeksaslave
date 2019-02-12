package propra2.repositories;

import org.springframework.data.repository.CrudRepository;
import propra2.model.Product;

import java.util.List;


public interface ProductRepository extends CrudRepository<Product, Long> {
    List<Product> findByTitle(String title);
}