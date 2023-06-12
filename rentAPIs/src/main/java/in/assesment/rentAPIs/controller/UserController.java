package in.assesment.rentAPIs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.assesment.rentAPIs.model.Product;
import in.assesment.rentAPIs.model.User;
import in.assesment.rentAPIs.service.ProductService;
import in.assesment.rentAPIs.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	 @Autowired
	    private UserService userService;
	 
	 @PostMapping
	    public String addUser(@RequestBody User user){
	        return (userService.addBooking(user)).toString();
	    }
	 
	 @GetMapping("/all")
	    public List<User> listAllUser(){
	        return (userService.listUser());
	    }
}
