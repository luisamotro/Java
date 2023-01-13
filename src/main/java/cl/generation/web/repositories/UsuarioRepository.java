package cl.generation.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.generation.web.models.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	// primero le pasamos el objeto con el que
	// se va a relacionar

	// luego el tipo de primary key

	// en repository va la lógica de manipulacion de datos
	// hacemos el CRUD y otras cosas
	// las operaciones que nos permiten trabajar con data
	
	//logica de manipulacion de datos 
	Usuario findByCorreo(String correo); 
	Usuario findByNick(String nick);

}
