package com.nabanita.TestProduct.service.impl;

import com.nabanita.TestProduct.model.Product;
import com.nabanita.TestProduct.repo.ProductRepository;
import com.nabanita.TestProduct.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private ProductRepository repo;

    @Override
    public Integer saveProduct(Product p) {
        return repo.save(p).getProdId();
    }

    @Override
    public void updateProduct(Product p) {

        repo.save(p);
    }

    @Override
    public void deleteProduct(Integer id) {

        repo.deleteById(id);
    }

    @Override
    public Optional<Product> getOneProduct(Integer id) {
        return repo.findById(id);
    }

    @Override
    public List<Product> getAllProduct() {
        return repo.findAll();
    }

    @Override
    public boolean isProductExists(Integer id) {
        return repo.existsById(id);
    }

}

