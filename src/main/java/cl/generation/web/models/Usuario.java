package cl.generation.web.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="usuarios")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min=3, max=15, message= "Error en el ingreso del nombre" )//size para texto, tamaño del nombre(caracteres)
	private String nombre;
	@NotNull
	private String correo;
	@NotNull
	private String password;
	
	

	
	

	//relacion con auto, uno a uno
	//mappedBy:quedara dispobible la tabla usuario, 
	//cascade: si elimino un dato, 1ero tengo que borrar la relacion
	
	@JsonIgnore //para ignorar el auto 
	@OneToOne(mappedBy = "usuario",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private Auto auto;
	
	//relacion uno a muchos, usuario con muchas direcciones
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Direccion> direcciones;
	
	//relacion muchos a muchos
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
			name = "roles_usuario",//nombre de tabla relacional
			joinColumns = @JoinColumn(name = "usuario_id"),//columnas de la tabla, relacion1
			inverseJoinColumns =  @JoinColumn(name = "rol_id")//relacion 2
			)
	private List<Rol> roles; 
	

	public void setAuto(Auto auto) {
		this.auto = auto;
	}

	@Transient //dice que la columna no sera considerada en la creacion de la tabla
	private String password2;
	
	private String nick;
	
	private String peso;
	
    //insertar registro
	
	@Column(updatable = false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	
    //actualizar registro
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
	
	
	public Usuario() {
		super();
	}

	public Usuario(Long id, String nombre, String correo, String password, String password2, String nick) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.correo = correo;
		this.password = password;
		this.password2 = password2;
		this.nick = nick;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}
	
	 public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}
	
	
	public Auto getAuto() {
		return auto;
	}

	// atributos de control: dos columnas donde 
	// agregar a la columna la fecha antes de insertar
	@PrePersist
	    protected void onCreate(){
	        this.createdAt = new Date();
	    }
	
	// para actualizar el atributo update, fecha del momento en que se actualiza
	@PreUpdate
	    protected void onUpdate(){
	        this.updatedAt = new Date();
	    }

	public void setApellido(String apellido) {
		// TODO Auto-generated method stub
		
	}
	

}
