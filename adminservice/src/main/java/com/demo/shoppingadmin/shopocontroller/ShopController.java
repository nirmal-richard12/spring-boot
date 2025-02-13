package com.demo.shoppingadmin.shopocontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.demo.shoppingadmin.model.Shop;
import com.demo.shoppingadmin.shopservice.ShopService;
import java.util.List;

@RestController
@RequestMapping("/admin/shops")
public class ShopController {
    @Autowired
    private ShopService shopService;

    @GetMapping("/all")
    public List<Shop> getShops() { return shopService.getAllShops1(); }

    @PostMapping("/add")
    public String addShop(@RequestBody Shop shop) {
        shopService.addShop(shop);
        return "Shop added successfully!";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteShop(@PathVariable Long id) {
        shopService.deleteShop(id);
        return "Shop deleted successfully!";
    }
}