package com.example.webApp2.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.webApp2.model.Users;
import com.example.webApp2.repository.UserRepository;

@Controller
public class UserController {
	@Autowired
	private UserRepository userRepo;
	
	@GetMapping("/users")
	public String showUsers(Model model) throws IOException {
		
		List<Users> users = userRepo.findAll();
		model.addAttribute("list" , users);
		
		for(Users obj : users) {	//for each loop to iterate individual user object from list.
			
			System.out.println(obj.getUserimage());
			String cond = Arrays.toString(obj.getUserimage());		//cast conversion of byte array to String.
			
			if(cond.equalsIgnoreCase("null")) {
				Path path = Path.of("D:\\project image\\default.png");	//default image path.
				byte[] img= Files.readAllBytes(path);		//convert binary file from path and converted into byte array.
				String image = Base64.getEncoder().encodeToString(img);
				obj.setUserimage2(image);
			}
			else {
				byte[] img = obj.getUserimage();	//convert image into byte code
				String image = Base64.getEncoder().encodeToString(img);		//encode image as a string
				obj.setUserimage2(image);
			}				
		}
		return "Users";
	}
}


/*	//	if(obj.getUserimage().length != 0) {		//condition to check the userimage have not a null value.
if(!obj.getUserimage().equals("null")) {
	byte[] img = obj.getUserimage();	//convert image into byte code
	String image = Base64.getEncoder().encodeToString(img);		//encode image as a string
	obj.setUserimage2(image);		//set image string into image2 
	//model.addAttribute("image",image);
}
else {
	System.out.println("hii2");
	Path path = Path.of("D:\\project image\\default.png");
	byte[] img= Files.readAllBytes(path);
	String image = Base64.getEncoder().encodeToString(img);
	obj.setUserimage2(image);
}

}	*/	