package general.boot.webservice.presentation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@GetMapping(value = "login.do")
	public String loginHome() {
		return "/login";
	}
	
	@PostMapping(value = "login.do")
	public String loginSubmit(@RequestParam String username, @RequestParam String password) {
		System.out.println(username);
		System.out.println(password);
		return "redirect:/home.do";
	}
}
