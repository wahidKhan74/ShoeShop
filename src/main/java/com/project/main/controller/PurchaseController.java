package com.project.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.main.model.PurchaseModel;
import com.project.main.repository.ProductRepository;
import com.project.main.repository.PurchaseRepository;

@RestController
@RequestMapping("/shoe-shop/purchases")
public class PurchaseController {

	@Autowired
	PurchaseRepository purc_repo;
	
	@Autowired
	ProductRepository prod_repo;
	
	@GetMapping(value = "/search/purchdate/{pd}")
	public List<PurchaseModel> getPurchaseDate(@PathVariable String pd){
		 List<PurchaseModel> purchase = ( List<PurchaseModel>) purc_repo.findByDate(pd);
		 return purchase;
	}
	
	@GetMapping(value = "/search/purchcategory/{pc}")
	public List<PurchaseModel> getPurchaseCategory(@PathVariable String pc){
		 List<PurchaseModel> purchase = ( List<PurchaseModel>) purc_repo.findByCategory(pc);
		 return purchase;
	}
}
