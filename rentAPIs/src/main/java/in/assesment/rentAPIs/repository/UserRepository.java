package in.assesment.rentAPIs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.assesment.rentAPIs.model.Product;
import in.assesment.rentAPIs.model.User;

public interface UserRepository extends JpaRepository<User,Integer>{
       
}
