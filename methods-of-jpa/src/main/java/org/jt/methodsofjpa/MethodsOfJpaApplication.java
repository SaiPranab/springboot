package org.jt.methodsofjpa;

import java.util.List;
import java.util.stream.IntStream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class MethodsOfJpaApplication implements CommandLineRunner {
	private final ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(MethodsOfJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var products = getProducts();

		productRepository.saveAll(products);
	}

	public List<Product> getProducts() {
		return IntStream.rangeClosed(1, 10)
				.mapToObj(i -> Product.builder()
						.productName("Product-" + i)
						.productBrand("Brand-" + i)
						.productPrice(1050.50 * i)
						.build())
				.toList();
	
	}

}
