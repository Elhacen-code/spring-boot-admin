package com.admin.client.springbootadminclient.dao;

import com.admin.client.springbootadminclient.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
