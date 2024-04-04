package com.nabanita.TestProduct.service;

import com.nabanita.TestProduct.model.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {

    public Integer saveProduct(Product p);
    public void updateProduct(Product p);
    public void deleteProduct(Integer id);
    public Optional<Product> getOneProduct(Integer id);
    public List<Product> getAllProduct();
    public boolean isProductExists(Integer id);

}