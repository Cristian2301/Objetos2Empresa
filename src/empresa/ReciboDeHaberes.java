package empresa;

import java.time.LocalDate;

public class ReciboDeHaberes {
	private String nombreDelEmpleado;
	private String direccion;
	private LocalDate fechaEmision;
	private Integer sueldoBruto;
	private Integer sueldoNeto;
	private Integer desgloceDeConceptos;
	
	
	private String getNombreDelEmpleado() {
		return nombreDelEmpleado;
	}
	
	private void setNombreDelEmpleado(String nombreDelEmpleado) {
		this.nombreDelEmpleado = nombreDelEmpleado;
	}
	
	private String getDireccion() {
		return direccion;
	}
	
	private void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	private LocalDate getFechaEmision() {
		return fechaEmision;
	}
	
	private void setFechaEmision(LocalDate fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	
	private Integer getSueldoBruto() {
		return sueldoBruto;
	}
	
	private void setSueldoBruto(Integer sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}
	
	private Integer getSueldoNeto() {
		return sueldoNeto;
	}
	
	private void setSueldoNeto(Integer sueldoNeto) {
		this.sueldoNeto = sueldoNeto;
	}
	
	private Integer getDesgloceDeConceptos() {
		return desgloceDeConceptos;
	}
	
	private void setDesgloceDeConceptos(Integer desgloceDeConceptos) {
		desgloceDeConceptos = desgloceDeConceptos;
	}
	
	public ReciboDeHaberes(String nombreDelEmpleado, String direccion, LocalDate fechaEmision, Integer sueldoBruto, Integer sueldoNeto, Integer desgloceDeConceptos) {
		this.nombreDelEmpleado = nombreDelEmpleado;
		this.direccion = direccion;
		this.fechaEmision = fechaEmision;
		this.sueldoBruto = sueldoBruto;
		this.sueldoNeto = sueldoNeto;
		this.desgloceDeConceptos = desgloceDeConceptos;
	}
	
	
}
