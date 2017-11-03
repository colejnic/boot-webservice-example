package general.boot.webservice.presentation.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import general.boot.webservice.integration.repository.UserRepository;

@Controller
public class HomeController {

	private UserRepository userRepository;
	
	@Autowired
	public HomeController(final UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@GetMapping("/home.do")
	public String home(final Model model) {
		model.addAttribute("users", userRepository.findAll());
		List<String> words = new ArrayList<String>(Arrays.asList("Object 1", "Object 2"));
		model.addAttribute("words", words);
		return "home/home";
	}
	
}
