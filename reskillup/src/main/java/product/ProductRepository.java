package product;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>{

	Optional<Product> findById(Long id);

	void save(Product product);

	void deleteById(Long id);

	List<Product> findAll();

}
