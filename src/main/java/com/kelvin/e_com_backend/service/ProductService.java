package com.kelvin.e_com_backend.service;

import com.kelvin.e_com_backend.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
   private ProductRepo repo;

}
