package org.jt.methodsofjpa;

import java.util.List;
import java.util.stream.IntStream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class MethodsOfJpaApplication implements CommandLineRunner {
	private final ProductRepository productRepository;
	private final ProductHistoryRepository historyRepository;

	public static void main(String[] args) {
		SpringApplication.run(MethodsOfJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// var products = getProducts();

		// productRepository.saveAll(products);
		// System.out.println(productRepository.count());
		// System.out.println(productRepository.existsById("0f88fd0a-8d6c-424a-9437-bb156d8a5320"));
		// productRepository.deleteById("0f83fd0a-8d6c-424a-9437-bb156d8a5320");
		/*
		 * var result = productRepository.findAll();
		 * result.forEach(System.out::println);
		 */

		/*
		 * var optionalProduct =
		 * productRepository.findById("68561a44-d748-4aee-821f-1b3e70b9d21c");
		 * if(optionalProduct.isPresent()) {
		 * System.out.println(optionalProduct.get());
		 * } else {
		 * System.out.println("No data found");
		 * }
		 */

		// var optionalProduct =
		// productRepository.findById("68561a44-d748-4aee-821f-1b3e70b9d21c");
		// if (optionalProduct.isPresent()) {
		// var product = optionalProduct.get();
		// product.setProductPrice(product.getProductPrice() + 1000);

		// productRepository.save(product);
		// } else {
		// System.out.println("No data found");
		// }

		// var result = productRepository.findAll(Sort.by(Direction.DESC,
		// "productPrice"));
		// result.forEach(System.out::println);

		// var optionalProduct = productRepository.findByProductName("Product-91");
		// if(optionalProduct.isPresent()) {
		// System.out.println(optionalProduct.get());
		// } else {
		// System.out.println("No data");
		// }

		// var product =productRepository.findByProductName("Product-91");
		// System.out.println(product);

		// var products = productRepository.findAllByProductPriceBetween(3000, 13400);
		// products.forEach(System.out::println);
		// var products = productRepository.getProduct(1050.50, "Brand-1");
		// System.out.println(products);

		// int affectedRow = productRepository.updatePrice(6000,
		// "5cecb780-46ad-4c27-bb49-b4d9f34c4935");
		// System.out.println(affectedRow);

		transactionConcept();

	}

	@Transactional
	public void transactionConcept() {
		var productId = "5cecb780-46ad-4c27-bb49-b4d9f34c4935";
		productRepository.deleteById(productId);
		boolean b = false;
		if (b)
			throw new RuntimeException();

		var history = ProdcutHistory.builder()
				.productId(productId)
				.build();
		historyRepository.save(history);
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
