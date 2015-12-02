package com.nixmash.springdata.solr.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.nixmash.springdata.solr.model.Product;

public interface ProductService {

	public List<Product> getAvailableProducts();

	Iterable<Product> getAllRecords();

	List<Product> getProducts();

	List<Product> getProductsByQuery();

	Product getProduct(String Id);

	void updateProductName(Product product);

	Iterable<Product> getProductsByNameOrCategory(String searchTerm);

	Page<Product> getProductsByPopularity(int popularity);

	Page<Product> getTestRecords();

	List<Product> searchWithCriteria(String searchTerm);

	List<Product> getProductsByNameOrCategoryAnnotatedQuery(String searchTerm);

}