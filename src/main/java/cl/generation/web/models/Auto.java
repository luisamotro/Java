package cl.generation.web.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="autos")
public class Auto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String marca;
	private String color;
	
	@JsonIgnore
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
			name = "autos_ventas",
			joinColumns = @JoinColumn(name = "auto_id"),
			inverseJoinColumns =  @JoinColumn(name = "venta_id")//columna de la tabla con la que relacionemos
			)
	private List<Venta> ventas; 
	
	
	
	
	
	
	
	//relacion con usuario
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="usuario_id")//es con la PK de la tabla con la que relacionamos
	private Usuario usuario;
	
	public Auto() {
		super();
	}

	public Auto(Long id, String marca, String color, Usuario usuario) {
		super();
		this.id = id;
		this.marca = marca;
		this.color = color;
		this.usuario= usuario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public List<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(List<Venta> ventas) {
		this.ventas = ventas;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	

}
