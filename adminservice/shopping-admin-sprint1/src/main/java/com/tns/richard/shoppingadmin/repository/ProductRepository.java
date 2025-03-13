package com.tns.richard.shoppingadmin.repository;

import com.tns.richard.shoppingadmin.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
