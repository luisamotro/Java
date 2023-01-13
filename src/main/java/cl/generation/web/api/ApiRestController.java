package cl.generation.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.generation.web.services.UsuarioServiceImpl;

@RestController
@RequestMapping("/api")
public class ApiRestController {
	
	@Autowired // para insertar dependecias, es decir, tomar todos los metodos de la clase que vamos a usar
	//vincular el controlador con el implements
	private UsuarioServiceImpl usuarioServiceImpl;// varibale de tipo usuarioser...
	
	//http://localhost:9080/guardar/usuario
	@RequestMapping("/hola")
	public String hola () {
		return "hola api";
	}

	
	//http:localhost:9080/api/edad/20
	@RequestMapping("/edad/{edad}")//ruta estatica dentro tiene una dinamica
	public String rutaDinamica(@PathVariable("edad") int edad) {
		return "Capturando edad:" +edad;
	}
	
	@RequestMapping("/nombre/{nombre}")
	public String capturarNombre(@PathVariable("nombre") String nombre) {
		return "El nombre capturado es: "+nombre;
	}
	
	// http://localhost:9080/api/14/noviembre/2022
	@RequestMapping("/{dia}/{mes}/{año}")
	public String rutaDinamica(@PathVariable("dia") int dia, @PathVariable("mes") String mes, @PathVariable("año") int año) {
		return "capturando fecha: "+dia + " " + mes+ " " + año;
	}	
	
	// ruta para pasar un parametro o de tipo get 
	//http://localhost:9080/api/usuario?usuarioId=1//GET
		@RequestMapping("/usuario")
		public String parametro(@RequestParam(value="usuarioId",required = false) Integer id ) {
			//int , long , float =0
			//Integer, Float, Long... pueden ser nulos
			if(id == null) {
				return "parametro no existe";
			}else {
				return "parametro por get " +id;
			}
		}
		
		//ruta para pasar 2 parametros, usuarioId y nombre
		
		//http://localhost:9080/api/usuario2?usuarioId=1&nombre=luisa
		@RequestMapping("/usuario2")
		public String parametro2(@RequestParam(value="usuarioId",required = false) Integer id,
				@RequestParam(value="nombre",required = false) String nombre) {

			if(id == null) {
				return "parametro no existe";
			}else {
				return "parametro por get "+id + " nombre: "+nombre;
			}
		}

		
		
		
		
		

	
	
	
	
	
	
	
	
	
	
	
	
}