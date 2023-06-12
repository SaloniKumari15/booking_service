package in.assesment.rentAPIs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.assesment.rentAPIs.model.Product;
import in.assesment.rentAPIs.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	 @Autowired
	    private ProductService productService;
	 
	 @PostMapping
	    public String addProduct(@RequestBody Product product){
	        return (productService.addProduct(product)).toString();
	    }
	 
	 @GetMapping("/all")
	    public List<Product> listAllProduct(){
	        return (productService.listProduct());
	    }
}
