package com.demo.shoppingadmin.shoprepository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.demo.shoppingadmin.model.Shop;
public interface ShopRepository extends JpaRepository<Shop, Long> {
}