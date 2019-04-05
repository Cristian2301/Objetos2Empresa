package empresa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmpleadoTest {

	Empleado empleado;
		
	@BeforeEach
	void setUp() throws Exception{
		empleado = new Empleado("Jose", 212, true, 99, 12000);
	}
	
	@Test
	void testGetNombre() {
		assertTrue(empleado.getNombre() == "Jose");
	}

	@Test
	void testSetNombre() {
		fail("Not yet implemented");
	}

	@Test
	void testGetDireccion() {
		fail("Not yet implemented");
	}

	@Test
	void testSetDireccion() {
		fail("Not yet implemented");
	}

	@Test
	void testGetCasado() {
		fail("Not yet implemented");
	}

	@Test
	void testSetCasado() {
		fail("Not yet implemented");
	}

	@Test
	void testGetFechaNacimiento() {
		fail("Not yet implemented");
	}

	@Test
	void testSetFechaNacimiento() {
		fail("Not yet implemented");
	}

	@Test
	void testGetSueldoBasico() {
		fail("Not yet implemented");
	}

	@Test
	void testSetSueldoBasico() {
		fail("Not yet implemented");
	}

	@Test
	void testGetEdad() {
		fail("Not yet implemented");
	}

	@Test
	void testEmpleado() {
		fail("Not yet implemented");
	}

}
