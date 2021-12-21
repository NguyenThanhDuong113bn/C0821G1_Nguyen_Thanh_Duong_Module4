package com.codegym.service;


import com.codegym.model.Product;
import com.codegym.repository.IProductServiceRepository;
import com.codegym.repository.impl.HibernateProductRepoImp;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImp implements IProductService {

    IProductServiceRepository productServiceRepository = new HibernateProductRepoImp();

    @Override
    public List<Product> findAll() {
        return productServiceRepository.findAll();
    }

    @Override
    public void save(Product product) {
        productServiceRepository.save(product);
    }

    @Override
    public void update(Product product) {
        productServiceRepository.update(product);
    }

    @Override
    public void delete(int id) {
        productServiceRepository.delete(id);
    }

    @Override
    public Product findById(int id) {
        return productServiceRepository.findById(id);
    }

    @Override
    public List<Product> search(String productName) {
        return productServiceRepository.search(productName);
    }

}