package cl.generation.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.generation.web.models.Pais;
import cl.generation.web.repositories.PaisRepository;

@Service
public class PaisServiceImpl implements PaisService{

	//Conexion con repositorio 
	/*con @autowired se trae PaisRepository de su package,
	 * para tener acceso a los metodos dentro de el*/
	 

	@Autowired
	private PaisRepository paisRepository;

	//Aqui se guarda al pais, y retornara lo que se acaba de guardar
	@Override
	public Pais guardarPais(Pais pais) {
		return paisRepository.save(pais);
	}
	
	
	
	

	
}
