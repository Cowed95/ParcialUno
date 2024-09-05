package main.test.com.miempresa.miapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.com.miempresa.miapp.Estudiante;

class ServicioEstudianteTest {

	Estudiante estudiante;
	
	@BeforeEach
	void antes() {
		estudiante = new Estudiante("Juan", 20, "asd123");
	}
	
	@Test
	void testNombre() {
	String nombre = estudiante.getNombre();
	assertEquals("Juan", nombre);
	}
	
	@Test
	void testEdad() {
		int edad = estudiante.getEdad();
		assertEquals(20, edad);
	}

}
