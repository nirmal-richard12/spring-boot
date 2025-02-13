package com.demo.shoppingadmin.model;
import jakarta.persistence.*;

@Entity
@Table(name = "shops")
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String shopName;
    private String ownerName;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getShopName() { return shopName; }
    public void setShopName(String shopName) { this.shopName = shopName; }

    public String getOwnerName() { return ownerName; }
    public void setOwnerName(String ownerName) { this.ownerName =ownerName;}
}