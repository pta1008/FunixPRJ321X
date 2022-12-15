package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@GetMapping("/login.html")
	public ModelAndView homePage() {
		ModelAndView m = new ModelAndView();
		m.setViewName("login");
		m.addObject("error", "");
		return m;
	}
	
	@PostMapping("/login")
	public ModelAndView login (HttpServletRequest request, HttpServletResponse response) {
		System.out.println(request.getParameter("username"));
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username==null);
		System.out.println(username);
		if(!username.isEmpty() && !password.isEmpty()) {
			if(username.equalsIgnoreCase("admin") && password.equals("admin")) {
				return new ModelAndView("confirmation", "username", username);
			} else {
				return new ModelAndView("/login", "error", "Username or password is invalid");
			}
		}
		return new ModelAndView("/login", "error", "Please enter username and password");
	}

}
