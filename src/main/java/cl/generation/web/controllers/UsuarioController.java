package cl.generation.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuario")
// siempre se pone esta anotación en los controladores
public class UsuarioController {	
	//localhost:8081/
	@RequestMapping("/")
	// capturar las rutas
	public String getUser() {
		System.out.println("Metodo para obtener usuario");
		return "index.jsp";
	}
	//localhost:8081/home
	@RequestMapping("/home")
	public String home() {
		System.out.println("en el metodo home");
		return "home";
	}
}