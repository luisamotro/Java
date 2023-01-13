package cl.generation.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import cl.generation.web.models.Auto;
import cl.generation.web.models.Usuario;
import cl.generation.web.services.AutoServiceImpl;

@RestController
public class AutoApiRestController {
	@Autowired
	private AutoServiceImpl autoServiceImpl;
	
	//solicitando datos de auto, y solo el id de usuario
	@RequestMapping("/guardar/auto")
	public Auto guardarUsuario(@RequestBody Auto auto,
			@RequestParam(value="usuarioId",required = false) Long usuarioId) {
		
		return autoServiceImpl.guardarAuto(auto);
	
	
	
	}
	
	

	
	
	
	
	
	
	

}
