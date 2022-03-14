package com.project.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.main.model.PurchaseModel;

public interface PurchaseRepository extends JpaRepository<PurchaseModel, Integer>{

	@Query("SELECT p FROM PurchaseModel p WHERE p.purchase_Date = ?1")
	List<PurchaseModel> findByDate(String pd);
	
//	//Select * from purchase_tbl where shoeID in (select shoeID from product_tbl where shoeCategory = "Casual shoes");
//	@Query("select p from PurchaseModel p join p.ProductModel pm where pm.shoe_ID = ?1")
	
	@Query("Select pt from PurchaseModel pt where pt.productModel.shoeCategory=?1")
	List<PurchaseModel> findByCategory(String pc);
	

}
