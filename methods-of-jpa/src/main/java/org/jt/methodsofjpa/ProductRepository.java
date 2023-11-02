package org.jt.methodsofjpa;

import java.util.Optional;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductRepository extends JpaRepository<Product, String> {
    Optional<Product> findByProductName(String productName);

    List<Product> findAllByProductPriceBetween(double startPrice, double endPrice);

    @Query("SELECT p FROM Product p WHERE p.productBrand=:brand AND p.productPrice=:price")
    List<Product> getProduct(@Param("price") double price, @Param("brand") String brand);

    @Modifying
    @Query("UPDATE Product p SET p.productPrice=:price WHERE p.productId = :id")
    int updatePrice(@Param("price") double productPrice, @Param("id") String productId);
}
