package empresa;

public class Empleado {
	private String nombre; 
	private Integer direccion;
	private Boolean casado;
	private Integer fechaNacimiento;
	private Integer sueldoBasico;
	
	public Integer getEdad() {
		return 2019 - fechaNacimiento;
	}
	
	public void empleado(String nombre, Integer direccion, Boolean casado, Integer fechaNacimiento, Integer sueldoBasico) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.casado = casado;
		this.fechaNacimiento = fechaNacimiento;
		this.sueldoBasico = sueldoBasico;
	}
	
}
