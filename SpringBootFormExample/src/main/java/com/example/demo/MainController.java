package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/register")
	public String showForm(Model model) {
		User user = new User();
		model.addAttribute("user",user);
		List<String>listProfession = Arrays.asList("Developer","tester","manager");
		model.addAttribute("listProfession",listProfession);
		return "register_form";
	}
}
