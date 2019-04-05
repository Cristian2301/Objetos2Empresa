package empresa;

public class PlantaPermanente extends Empleado {
	private Integer cantHijos;
	private Integer antiguedad;
	
		public Integer asignacionXHijo() {
			return 150 * cantHijos;
		}
		
		public PlantaPermanente(String nombre, Integer direccion, Boolean casado, Integer fechaNacimiento, Integer sueldoBasico, Integer cantHijos, Integer antiguedad) {
			super(nombre, direccion, casado, fechaNacimiento, sueldoBasico);
		}
//		
//		public Integer asignacionXConyugue() {
//			if() {
//				
//			}
//		}
}
