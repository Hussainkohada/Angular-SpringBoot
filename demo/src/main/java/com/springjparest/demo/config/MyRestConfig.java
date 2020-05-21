package com.springjparest.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;

import com.springjparest.demo.Model.Product;
import com.springjparest.demo.Model.ProductCategory;
@Configuration
public class MyRestConfig implements RepositoryRestConfigurer{

	
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		HttpMethod[] unSupportedActions= {HttpMethod.PUT,HttpMethod.POST,HttpMethod.DELETE};
		config.getExposureConfiguration().forDomainType(Product.class)
					.withItemExposure((metdata,httpMethods)->httpMethods.disable(unSupportedActions))
					.withCollectionExposure((metdata,httpMethods)->httpMethods.disable(unSupportedActions));
		config.getExposureConfiguration().forDomainType(ProductCategory.class)
		.withItemExposure((metdata,httpMethods)->httpMethods.disable(unSupportedActions))
		.withCollectionExposure((metdata,httpMethods)->httpMethods.disable(unSupportedActions));
	}
}
