package in.assesment.rentAPIs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.assesment.rentAPIs.model.Product;
import in.assesment.rentAPIs.model.User;
import in.assesment.rentAPIs.repository.ProductRepository;
import in.assesment.rentAPIs.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private ProductService prodsevice;
	
	public List<User> listUser(){
        return userRepo.findAll();
    }

	public Object addBooking(User user) {	
		return userRepo.save(user);
	}

	
	
	

}
