package com.project.main.controller;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.main.model.ProductModel;
import com.project.main.repository.ProductRepository;

@RestController
@RequestMapping("/shoe-shop/products")
public class ProductController {
	
	@Autowired
	ProductRepository prod_repo;
	
	@PostMapping(value = "/product/add")
	public ProductModel postProductAdd(@RequestBody ProductModel product) {
		return prod_repo.save(product);
	}

	@PutMapping(value = "/product/update")
	public ProductModel putProductUpdate(@RequestBody ProductModel product) {
		return prod_repo.save(product);
	}

	@DeleteMapping(value = "/product/delete/{id}")
	public void deleteProductId(@PathVariable int id) {
		prod_repo.deleteById(id);
	}

	@GetMapping(value = "/search/id/{id}")
	public Optional<ProductModel> getProduct(@PathVariable int id) {
		return prod_repo.findById(id);
	}
	
	@GetMapping(value = "/search/brand/{sb}")
	public List<ProductModel> getShoeBrand(@PathVariable String sb){
		List<ProductModel> product = (List<ProductModel>) prod_repo.findByshoe_Brand(sb);
		return product;
	}
	
	@GetMapping(value = "/search/name/{sn}")
	public List<ProductModel> getShoeName(@PathVariable String sn){
		List<ProductModel> product = (List<ProductModel>) prod_repo.findByshoe_Name(sn);
		return product;
	}
	
	@GetMapping(value = "/search/category/{sc}")
	public List<ProductModel> getShoecategory(@PathVariable String sc){
		List<ProductModel> product = (List<ProductModel>) prod_repo.findByshoe_Category(sc);
		return product;
	}
	
	@GetMapping(value = "/search/color/{scol}")
	public List<ProductModel> getShoeColor(@PathVariable String scol){
		List<ProductModel> product = (List<ProductModel>) prod_repo.findByshoe_Color(scol);
		return product;
	}
	
	@GetMapping(value = "/search/price/{sp}")
	public List<ProductModel> getShoePrice(@PathVariable Double sp){
		List<ProductModel> product = (List<ProductModel>) prod_repo.findByshoe_Price(sp);
		return product;
	}
	
	@GetMapping(value = "/search/manudate/{smd}")
	public List<ProductModel> getShoeManufactureDate(@PathVariable String smd){
		List<ProductModel> product = (List<ProductModel>) prod_repo.findByshoe_ManufactureDate(smd);
		return product;
	}
	
	@GetMapping(value = "/search/quantity/{sq}")
	public List<ProductModel> get(@PathVariable int sq){
		List<ProductModel> product = (List<ProductModel>) prod_repo.findByshoe_Quantity(sq);
		return product;
	}
	 
}
