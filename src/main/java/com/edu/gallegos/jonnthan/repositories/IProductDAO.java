package com.edu.gallegos.jonnthan.repositories;

import com.edu.gallegos.jonnthan.models.ProductDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductDAO extends MongoRepository<ProductDTO, String> {


}