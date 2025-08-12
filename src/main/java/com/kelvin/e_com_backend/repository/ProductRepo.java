package com.kelvin.e_com_backend.repository;

import com.kelvin.e_com_backend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
