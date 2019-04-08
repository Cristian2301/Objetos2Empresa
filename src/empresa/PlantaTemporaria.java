package empresa;

import java.time.LocalDate;

public class PlantaTemporaria extends Empleado {
	private  Integer fechaFinDesignacion;
	private Integer horasExtras;
	
	
	private Integer getFechaFinDesignacion() {
		return fechaFinDesignacion;
	}
	
	private void setFechaFinDesignacion(Integer fechaFinDesignacion) {
		this.fechaFinDesignacion = fechaFinDesignacion;
	}
	
	private Integer getHorasExtras() {
		return horasExtras;
	}
	
	private void setHorasExtras(Integer horasExtras) {
		this.horasExtras = horasExtras;
	}
	
	private PlantaTemporaria(String nombre, Integer direccion, Boolean casado, LocalDate fechaNacimiento, Integer sueldoBasico, Integer fechaFinDesignacion, Integer horasExtras) {
		super(nombre, direccion, casado, fechaNacimiento, sueldoBasico);
		this.fechaFinDesignacion = fechaFinDesignacion;
		this.horasExtras = horasExtras;
	}
	
	
	public Integer sueldoBruto() {
		return sueldoBasico + (40 * horasExtras);
	}
	
	
	public Integer retenciones() {
		return this.obraSocial() + this.aportesJubilatorios();
	}
	
	public Integer obraSocial() {
		return ((this.sueldoBruto() * 10) / 100) + this.Pesos25SiTieneMasDe50Anos();
	}
	
	public Integer Pesos25SiTieneMasDe50Anos() {
		if(this.getEdad() > 50) {
			return 25;
		}
		else {
			return 0;
		}
	}
	
	public Integer aportesJubilatorios() {
		return ((this.sueldoBruto() * 10) / 100) + (5 * horasExtras);
	}
	
	public Integer sueldoNeto() {
		return this.sueldoBruto() - this.retenciones();
	}
	
}




