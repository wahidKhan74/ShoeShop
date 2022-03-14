package com.project.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.main.model.ProductModel;

public interface ProductRepository extends JpaRepository<ProductModel, Integer>{
	
	@Query("SELECT p FROM ProductModel p WHERE p.shoe_Brand = ?1")
	List<ProductModel> findByshoe_Brand(String bn);
	
	@Query("SELECT p FROM ProductModel p WHERE p.shoe_Name = ?1")
	List<ProductModel> findByshoe_Name(String sn);

	@Query("SELECT p FROM ProductModel p WHERE p.shoe_Category = ?1")
	List<ProductModel> findByshoe_Category(String sc);

	@Query("SELECT p FROM ProductModel p WHERE p.shoe_Color = ?1")
	List<ProductModel> findByshoe_Color(String scol);

	@Query("SELECT p FROM ProductModel p WHERE p.shoe_Price = ?1")
	List<ProductModel> findByshoe_Price(Double sp);

	@Query("SELECT p FROM ProductModel p WHERE p.shoe_ManufactureDate = ?1")
	List<ProductModel> findByshoe_ManufactureDate(String smd);

	@Query("SELECT p FROM ProductModel p WHERE p.shoe_Quantity = ?1")
	List<ProductModel> findByshoe_Quantity(int sq);

}
