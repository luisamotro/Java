package cl.generation.web.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.generation.web.models.Usuario;
import cl.generation.web.services.UsuarioServiceImpl;

@RestController
public class UsuarioApiRestController {
	@Autowired
	private UsuarioServiceImpl usuarioServiceImpl;
	
	
	//para capturar los valores de un API
	@RequestMapping("/guardar/usuario")
	public Boolean guardarUsuario(@RequestBody Usuario usuario) {//captura los datos de un usuario desde el cuerpo
		/*
		 * { // Estos son los datos que recibiremos y guardaremos en la variable usuario
		 * nombre:"Luisa",
		 * correo:"L@gmail.com",
		 * password: "1234"
		 * }
		 * */
		return	usuarioServiceImpl.guardarUsuario(usuario); //"Usuario guardado";
	}
	
	//ruta para eliminar un usuario
	@RequestMapping("/eliminar/usuario")
	public String eliminarUsuario(@RequestParam(value = "id", required = false)Long id) {
		String respuesta = usuarioServiceImpl.eliminarUsuario(id);
		return "";
	}
	

	//ruta para actualizar
	//http://localhost:9080/actualizar/usuario
	@RequestMapping("/actualizar/usuario")
	public Boolean actualizarUsuario(@RequestBody Usuario usuario) {
		return	usuarioServiceImpl.guardarUsuario (usuario); //"Usuario guardado";
	}
	
	//ruta para obtener usuario
	//http://localhost9080
	@RequestMapping("/obtener/usuario")
	public Usuario obtenerUsuario (@RequestParam(value = "id", required = true ) Long id) {
		return usuarioServiceImpl.obtenerUsuario(id);
	}
	
	//listar todos los usuarios
	//(getmapping admite solo peticiones de tipo get, y requestmapping acepta todo)
	@GetMapping("/listar/usuarios")
	public List<Usuario>obtenerListaUsuarios(){
		return usuarioServiceImpl.obtenerListaUsuarios();
	}
	
	
	
	
	
	
	

}
