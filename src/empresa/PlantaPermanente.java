package empresa;

import java.time.LocalDate;

public class PlantaPermanente extends Empleado {
	private Integer cantHijos;
	private Integer antiguedad;

	
	private Integer getCantHijos() {
		return cantHijos;
	}

	private void setCantHijos(Integer cantHijos) {
		this.cantHijos = cantHijos;
	}

	private Integer getAntiguedad() {
		return antiguedad;
	}

	private void setAntiguedad(Integer antiguedad) {
		this.antiguedad = antiguedad;
	}


	public PlantaPermanente(String nombre, Integer direccion, Boolean casado, LocalDate fechaNacimiento, Integer sueldoBasico, Integer cantHijos, Integer antiguedad) {
		super(nombre, direccion, casado, fechaNacimiento, sueldoBasico);
		this.antiguedad = antiguedad;
		this.cantHijos = cantHijos;
	}
	
	
	public Integer sueldoBruto() {
		return sueldoBasico + this.salarioFamiliar() + (50 * antiguedad);
	}
	
	public Integer salarioFamiliar() {
		return this.asignacionXHijo() + this.asignacionXConyuge();
	}
	
	public Integer asignacionXHijo() {
		return 150 * cantHijos;
	}
		
	public Integer asignacionXConyuge() {
		if (casado) {
			return 100;
		} else {
			return 0;
		}
	}
	
	
	public Integer retenciones() {
		return this.obraSocial() + this.aportesJubilatorios();
	}
	
	public Integer obraSocial() {
		return ((this.sueldoBruto() * 10) / 100) + (20 * cantHijos);
	}
	
	public Integer aportesJubilatorios() {
		return (this.sueldoBruto() * 15) / 100;
	}
	
	public Integer sueldoNeto() {
		return this.sueldoBruto() - this.retenciones();
	}
}








