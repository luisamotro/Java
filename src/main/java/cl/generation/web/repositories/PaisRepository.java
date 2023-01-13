package cl.generation.web.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;
import cl.generation.web.models.Pais;

@Repository
public interface PaisRepository extends JpaRepositoryImplementation<Pais, Long>{

	//esta es la conexion con base de datos 
}
