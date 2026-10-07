package test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//import com.sun.org.apache.xpath.internal.operations.Equals;

import Sesion2B.Empleado;


class TestEmpleado {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		
		EmpleadoVendedor999();
		EmpleadoVendedor1000();
		EmpleadoVendedor1501();
		
		EmpleadoEncargado999();
		EmpleadoEncargado1000();
		EmpleadoEncargado1501();
		
		NominaNetaMenor2100();
		NominaNetaEntre2100y2500();
		NominaNetaMayor2500();
	}
	//Assert nomina bruta

	@Test
	void EmpleadoVendedor999() {
	assertEquals(2090f, Empleado.calculoNominaBruta(Empleado.TipoEmpleado.Vendedor, 999, 3));
	}
	
	@Test
	void EmpleadoVendedor1000() {
	assertEquals(2190f, Empleado.calculoNominaBruta(Empleado.TipoEmpleado.Vendedor, 1000, 3));
	}
	
	
	@Test
	void EmpleadoVendedor1501() {
	assertEquals(2290f, Empleado.calculoNominaBruta(Empleado.TipoEmpleado.Vendedor, 1501, 3));
	}
	
	
	
	@Test
	void EmpleadoEncargado999() {
	assertEquals(2590f, Empleado.calculoNominaBruta(Empleado.TipoEmpleado.Encargado, 999, 3));
	}
	
	@Test
	void EmpleadoEncargado1000() {
	assertEquals(2690f, Empleado.calculoNominaBruta(Empleado.TipoEmpleado.Encargado, 1000, 3));
	}
	
	
	@Test
	void EmpleadoEncargado1501() {
	assertEquals(2790f, Empleado.calculoNominaBruta(Empleado.TipoEmpleado.Encargado, 1501, 3));
	}
	
	
	//Assert nomina neta
	@Test
	void NominaNetaMenor2100() {
	assertEquals(2000f, Empleado.CalculoNominaNeta(2000f));
	}
	
	@Test
	void NominaNetaEntre2100y2500() {
	assertEquals(1870f, Empleado.CalculoNominaNeta(2200f));
	}
	
	@Test
	void NominaNetaMayor2500() {
		
	assertEquals(2296f, Empleado.CalculoNominaNeta(2800f));
	}
	
	
	
	

}
