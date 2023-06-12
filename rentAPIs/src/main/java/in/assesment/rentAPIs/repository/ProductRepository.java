package in.assesment.rentAPIs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.assesment.rentAPIs.model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{
       
}
