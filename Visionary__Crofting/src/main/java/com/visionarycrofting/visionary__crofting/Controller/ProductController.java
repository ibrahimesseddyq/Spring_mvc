package com.visionarycrofting.visionary__crofting.Controller;

import com.visionarycrofting.visionary__crofting.Entities.Product;
import com.visionarycrofting.visionary__crofting.Service.ProductService;
import com.visionarycrofting.visionary__crofting.Service.ProductServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductServiceImp productServiceImp;

    @GetMapping("/allProducts")
    public List<Product> productList(){
        return productServiceImp.productList();
    }
    @PostMapping("/add")
    public void saveProduct(Product product){
         productServiceImp.saveProduct(product);
    }

    @PutMapping("/update")
    public void updateProduct(Product product,Long id){
        productServiceImp.getProductByID(id);
    }
    public void deleteProduct(Long id){
        productServiceImp.deleteProduct(id);

    }

}