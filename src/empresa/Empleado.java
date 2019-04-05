package empresa;

public class Empleado {
	private String nombre; 
	private Integer direccion;
	private Boolean casado;
	private Integer fechaNacimiento;
	private Integer sueldoBasico;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getDireccion() {
		return direccion;
	}

	public void setDireccion(Integer direccion) {
		this.direccion = direccion;
	}

	public Boolean getCasado() {
		return casado;
	}

	public void setCasado(Boolean casado) {
		this.casado = casado;
	}

	public Integer getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Integer fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Integer getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(Integer sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}


	public Integer getEdad() {
		return 2019 - fechaNacimiento;
	}
	
	public Empleado(String nombre, Integer direccion, Boolean casado, Integer fechaNacimiento, Integer sueldoBasico) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.casado = casado;
		this.fechaNacimiento = fechaNacimiento;
		this.sueldoBasico = sueldoBasico;
	}
	
}
