package com.example.secondrepoforweek3.controller;


import com.example.secondrepoforweek3.Entity.Product;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.secondrepoforweek3.service.service;

import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Inventory")

public class controller {

    private service functions;

    @GetMapping("/GET")
    public ArrayList<Product> GetProduct(){
        return functions.GetProduct();
    }

}
