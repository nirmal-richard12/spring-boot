package com.tns.richard.shoppingadmin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tns.richard.shoppingadmin.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
