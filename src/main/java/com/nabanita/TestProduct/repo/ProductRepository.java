package com.nabanita.TestProduct.repo;

import com.nabanita.TestProduct.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
