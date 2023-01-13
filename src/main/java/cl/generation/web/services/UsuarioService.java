package cl.generation.web.services;

import java.util.List;
import java.util.Optional;

import cl.generation.web.models.Usuario;

public interface UsuarioService {
	//aqui se definen los metodos
	public Boolean guardarUsuario(Usuario usuario);
	public String eliminarUsuario(Long id);
	public String actualizarUsuario(Usuario usuario);
	public Usuario obtenerUsuario(Long id);
	public List<Usuario> obtenerListaUsuarios();
	//login, metodo que recibe dos parametros
	public Boolean ingresoUsuario(String email, String password);
	public Optional<Usuario> obtenerDatosUsuario(Long id);

}

//interfaces: definir funciones
	// o metodos

	// repositories: solo creacion
	// de interfaces

	// definir metodos para crud usuario
	
	
	

