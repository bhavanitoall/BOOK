package com.booking.BookingABook1.controller;


import java.io.IOException;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.booking.BookingABook1.dao.BookService;
import com.booking.BookingABook1.dao.RegisterDao;

import com.booking.BookingABook1.model.RegisterBean;
import com.booking.BookingABook1.repository.UserRepository;


@Controller
public class HomeController {
	
	//controller => service(or)dao => repository
	
	@Autowired
	UserRepository userRepository;
	
	

	
	@Autowired
	RegisterDao registerDao;
	

	
	
	@ModelAttribute
	public void models(Model map,@ModelAttribute("userDetails") RegisterBean userDetails){
		long cid= registerDao.customerCount()+1;
		map.addAttribute("cid", cid);
		
		
        
	}
	@GetMapping(value={"/home","/"})
	public String showHomePage(String string) {
		return "home";
	}

	@RequestMapping(value = "/user/home", method = RequestMethod.GET)
	public String userWelcome(Model map) {

		return "userhome";
	}

	@RequestMapping(value = "/admin/home", method = RequestMethod.GET)
	public String adminHome(Model map) {

		return "adminhome";
	}

	@RequestMapping(value = "/userlogin", method = RequestMethod.GET)
	public String loginPage() {
		return "userlogin";
	}
	
	
	
	@GetMapping("/signup")
	public String doRegister(Model map) {
		
		map.addAttribute("userDetails", new RegisterBean());
		return "signup";
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String postForm(@ModelAttribute("userDetails") RegisterBean userDetails, ModelMap model,
			BindingResult result) throws ClassNotFoundException, SQLException, IOException {
		
		registerDao.addDetails(userDetails);
		
		return "home";
	}
}