package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	
	// controller method to show form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	
	// controller method to process form
    @RequestMapping("/processForm")
    public String processForm() {
    	return "helloworld";
    }
    
    
    //new a controller method to read form data
    //add data to the model
    @RequestMapping("/proccesFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model) {
    	
    	String theName = request.getParameter("studentName");
    	theName = theName.toUpperCase();
    	String result = "Yo! " + theName;
    	
    	model.addAttribute("message", result);
    	
    	return "helloworld";
    }
    
    
    //new a controller method to read form data
    //add data to the model
    @RequestMapping("/proccesFormVersionThree")
    public String processFormVersionThreee(@RequestParam("studentName") String theName, Model model) {
    	
    	theName = theName.toUpperCase();
    	String result = "Yo! " + theName;
    	
    	model.addAttribute("message", result);
    	
    	return "helloworld";
    }
}
