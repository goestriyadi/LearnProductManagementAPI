package com.demo.productAPIJSON;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Page<Product> getAllProducts(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    public Optional<Product> getProductByCode(String code) {
        return productRepository.findByCode(code);
    }

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(String code, Product product) {
        Optional<Product> existingProduct = productRepository.findByCode(code);

        if (existingProduct.isPresent()) {
            Product updatedProduct = existingProduct.get();
            updatedProduct.setCode(product.getCode());
            updatedProduct.setName(product.getName());
            updatedProduct.setCategory(product.getCategory());
            updatedProduct.setBrand(product.getBrand());
            updatedProduct.setType(product.getType());
            updatedProduct.setDescription(product.getDescription());

            return productRepository.save(updatedProduct);
        }

        return null;
    }

    public void deleteProductByCode(String code) {
        productRepository.findByCode(code).ifPresent(productRepository::delete);
    }
}