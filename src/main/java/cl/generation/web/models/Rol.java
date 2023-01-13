package cl.generation.web.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter 
@Setter
@AllArgsConstructor 
@NoArgsConstructor 
@ToString
@Entity
@Table(name="roles")
public class Rol {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String nombre;
	private String descripcion;
	
	//relacion muchos a muchos, muchos usuarios con muchos roles
	@ManyToMany (mappedBy = "roles",fetch = FetchType.LAZY)
	private List <Usuario> usuarios;

	
	
	
	
	
	

}
