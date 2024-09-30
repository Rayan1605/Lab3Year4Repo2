package com.example.secondrepoforweek3.service;

import com.example.secondrepoforweek3.Entity.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class service {

    ArrayList<Product> Product = new ArrayList<>();

    public ArrayList<Product> GetProduct() {
        return Product;
    }

    public void addProduct(Product product) {
        Product.add(product);
    }


}
