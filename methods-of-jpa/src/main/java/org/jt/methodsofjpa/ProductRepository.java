package org.jt.methodsofjpa;

import java.util.Optional;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
    Optional<Product> findByProductName(String productName);

    List<Product> findAllByProductPriceBetween(double startPrice, double endPrice);
}
