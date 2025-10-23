package com.backontrack.hibernate.invoice.dao;

import com.backontrack.hibernate.invoice.Product;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface ProductDao extends CrudRepository<Product, Integer> {

}
