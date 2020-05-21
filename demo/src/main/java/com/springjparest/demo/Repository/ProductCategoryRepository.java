package com.springjparest.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.springjparest.demo.Model.ProductCategory;

@RepositoryRestResource(collectionResourceRel = "productcategory",path="productcategory")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long>{

}
