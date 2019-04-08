package empresa;

import java.time.LocalDate;

public abstract class Empleado {
	public String nombre; 
	public Integer direccion;
	public Boolean casado;
	public LocalDate fechaNacimiento;
	public Integer sueldoBasico;
//	public <Recibo> reciboDeHaberes;
	
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

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Integer getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(Integer sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}


	public Integer getEdad() {
		return LocalDate.now().getYear() - fechaNacimiento.getYear();
	}
	
	public Empleado(String nombre, Integer direccion, Boolean casado, LocalDate fechaNacimiento, Integer sueldoBasico) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.casado = casado;
		this.fechaNacimiento = fechaNacimiento;
		this.sueldoBasico = sueldoBasico;
	}
	
	public abstract Integer sueldoBruto();
	
	public abstract Integer retenciones();
	
	public abstract Integer sueldoNeto();
	
}
