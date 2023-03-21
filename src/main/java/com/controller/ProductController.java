package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.Entity.ProductEntity;
import com.dao.ProductRepository;

@Controller
public class ProductController {

	@Autowired
	ProductRepository productRepository;

	@GetMapping("/newproduct")
	public String newProduct() {
		return "NewProduct";
	}

	@PostMapping("/saveproduct")
	public String saveProduct(ProductEntity product)// the input are given in the form that are store in productentity
													// object
	{
		productRepository.save(product); // insert
		return "NewProduct";
	}

	@GetMapping("/products")
	public String getAllProducts(Model model) {
		List<ProductEntity> products = productRepository.findAll(); // now all products are in products
		model.addAttribute("products", products);// this will send data on jsp from database through list
		return "ListProducts";
	}

	@GetMapping("/deleteproduct/{productId}")
	public String deleteProduct(@PathVariable("productId") Integer productId) {
		productRepository.deleteById(productId);
		return "redirect:/products"; // for refreshing purpose
	}

	@GetMapping("/editproduct/{productId}")
	public String editProduct(@PathVariable("productId") Integer productId, Model model) {
		Optional<ProductEntity> product = productRepository.findById(productId);

		if (product.isPresent()) {
			ProductEntity product1 = product.get();
			model.addAttribute("product1", product1);
			return "EditProduct";
		}

		return "null "; // for refreshing purpose
	}

	@PostMapping("/updateproduct")
	public String updateProduct(ProductEntity product) {
		System.out.println("hey");
		productRepository.save(product);
		return "redirect:/products";
	}
}
