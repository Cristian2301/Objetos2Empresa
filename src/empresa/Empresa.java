package empresa;

import java.util.ArrayList;

public class Empresa {
	private Integer nombre;
	private Integer cuit;
	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	
	
	public Integer getNombre() {
		return nombre;
	}


	public void setNombre(Integer nombre) {
		this.nombre = nombre;
	}


	public Integer getCuit() {
		return cuit;
	}


	public void setCuit(Integer cuit) {
		this.cuit = cuit;
	}

	
	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}


	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}


	public Empresa (Integer nombre, Integer cuit, ArrayList<Empleado> empleados) {
		this.nombre = nombre;
		this.cuit = cuit;
		this.empleados = empleados;
	}
	
	
	public Integer montoTotalSueldoNeto() {
		Integer totalSueldoNeto = 0;
		for(Empleado e : empleados) {
			totalSueldoNeto += e.sueldoNeto();
		}
		return totalSueldoNeto;
	}
	
	public Integer montoTotalSueldoBruto() {
		Integer totalSueldoBruto = 0;
		for (Empleado e : empleados) {
			totalSueldoBruto += e.sueldoBruto(); 
		}
		return totalSueldoBruto;
	}
	
	public Integer montoTotalRetenciones() {
		Integer totalRetenciones = 0;
		for(Empleado e : empleados) {
			totalRetenciones += e.retenciones();
		}
		return totalRetenciones;
	}
	
}
