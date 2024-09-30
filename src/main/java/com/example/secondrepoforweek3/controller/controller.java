package com.example.secondrepoforweek3.controller;


import com.example.secondrepoforweek3.Entity.Product;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Inventory")
public class controller {

    @GetMapping("/GET")
    public List<Product> GetProduct(){
        return functions.GetProduct();
    }

}
