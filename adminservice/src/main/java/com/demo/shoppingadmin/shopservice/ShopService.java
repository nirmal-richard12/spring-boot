package com.demo.shoppingadmin.shopservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.shoppingadmin.model.Shop;
import com.demo.shoppingadmin.shoprepository.ShopRepository;
import java.util.List;

@Service
public class ShopService {
    @Autowired
    private ShopRepository shopRepository;

    public List<Shop> getAllShops() { return shopRepository.findAll(); }
    
    public Shop addShop1(Shop shop) { return shopRepository.save(shop); }
    
    public void deleteShop(Long id) { shopRepository.deleteById(id); }

	public List<Shop> getAllShops1() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addShop(Shop shop) {
		// TODO Auto-generated method stub
		
	}
}