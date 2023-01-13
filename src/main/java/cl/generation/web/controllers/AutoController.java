package cl.generation.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Auto")
public class AutoController {

	@RequestMapping("/")
	public String getAuto() {
		System.out.println("metodo obtener auto");
		return "index.jsp";
	}
	
	
}
