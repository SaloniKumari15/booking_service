package in.assesment.rentAPIs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.assesment.rentAPIs.model.Product;
import in.assesment.rentAPIs.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository prodRepo;
	
	public List<Product> listProduct(){
        return prodRepo.findAll();
    }

	public Object addProduct(Product product) {
		return prodRepo.save(product);
	}
	
	Product getproductByID(int productId) {
		Optional<Product> product= prodRepo.findById(productId);
		if (product.isPresent()) {
            Product validProduct = product.get();
            return validProduct;
        } 
		return null;
	}

}
