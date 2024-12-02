package com.infy.app.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.infy.app.entities.Hostel;
import com.infy.app.entities.Users;
import com.infy.app.service.HostelService;
import com.infy.app.service.UsersServiceInterface;

import antlr.StringUtils;

@Controller
public class HomeController {
	@Autowired
	private UsersServiceInterface usersServiceInterface;
	@Autowired
	private HostelService hostelService;
	@Autowired
	HttpSession session;
	
	
    
	public UsersServiceInterface getUsersServiceInterface() {
		return usersServiceInterface;
	}

	public void setUsersServiceInterface(UsersServiceInterface usersServiceInterface) {
		this.usersServiceInterface = usersServiceInterface;
	}
	
	public HostelService getHostelService() {
		return hostelService;
	}

	public void setHostelService(HostelService hostelService) {
		this.hostelService = hostelService;
	}

	@RequestMapping("/home")
	public ModelAndView homePageMenthod() {
		
		ModelAndView model = new ModelAndView("login");
		return model;
	}
	
	@RequestMapping("/register")
	public ModelAndView registrationPageMenthod() {
		
		ModelAndView model = new ModelAndView("register");
		return model;
	}
	
	@RequestMapping("/forgetpassword")
	public ModelAndView forgetPasswordPageMenthod() {
		
		ModelAndView model = new ModelAndView("forget_password");
		
		return model;
	}
	
	@RequestMapping(value="/saveuser",method=RequestMethod.POST)
	public ModelAndView saveUserMethod(@ModelAttribute("users") Users users) {
		
		ModelAndView model = new ModelAndView("regSuccess");
		
		usersServiceInterface.save(users);
		
		return model;
	}
	
	@RequestMapping(value="/authenticate",method=RequestMethod.POST)
	public ModelAndView authenticateUser(@ModelAttribute("users") Users users) {
		
		ModelAndView model = new ModelAndView("login");
		
		Users users1 = usersServiceInterface.findByUserId(users.getUserId());
		if(users1 != null && users.getPassword().equals(users1.getPassword())) {
			model.setViewName("userHomePage");
			model.addObject("users", users1);
			session.setAttribute("users", users1);
			
			List<Hostel> hostel = null;
			
			try {
				hostel = hostelService.findByUserId(users1.getUserId());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			model.addObject("hostellist", hostel);
		}
		return model;
	}
	
	@RequestMapping("addhostel")
	public ModelAndView addHostel() {
		ModelAndView model = new ModelAndView("addHostel");
		
		return model;
	}
	
	@RequestMapping("savehostel")
	public ModelAndView addHostel( @ModelAttribute("hostel") Hostel hostel) {
		ModelAndView model = new ModelAndView("userHomePage");
		hostelService.save(hostel);
		
		Users users = (Users)session.getAttribute("users");
		List<Hostel> hostels = null;
		
		try {
			hostels = hostelService.findByUserId(users.getUserId());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.addObject("hostellist", hostels);
		
		return model;
	}
	
	@RequestMapping("hostelpage")
	public ModelAndView hostelPage(@RequestParam("hostelName") String hostelName){
		ModelAndView model = new ModelAndView("hostel");
		
		 Hostel hostel = hostelService.findByHostel(hostelName);
		model.addObject("hostels",hostel);
		
	   
		
		return model;
	}
	
	@RequestMapping("userhome")
	public ModelAndView userHome() {
		
		ModelAndView model = new ModelAndView("userHomePage");
		Users users = (Users)session.getAttribute("users");
      List<Hostel> hostels = null;
		
		try {
			hostels = hostelService.findByUserId(users.getUserId());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.addObject("hostellist", hostels);
		return model;
	}

	
	
}
