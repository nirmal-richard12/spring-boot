package com.demo.shoppingadmin.service;


	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	import com.demo.shoppingadmin.Admin;
	import com.demo.shoppingadmin.repository.AdminRepository;
	@Service
	public class AdminService {
	    @Autowired
	    private AdminRepository adminRepository;

	    public Admin login(String username, String password) {
	        Admin admin = adminRepository.findByUsername(username);
	        if (admin != null && admin.getPassword().equals(password)) {
	            return admin;
	        }
	        return null;
	    }
	}