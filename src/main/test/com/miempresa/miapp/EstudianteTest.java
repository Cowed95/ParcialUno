package main.test.com.miempresa.miapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.com.miempresa.miapp.Estudiante;

class EstudianteTest {

	Estudiante estudiante;
	
	@BeforeEach
	void antes() {
		estudiante = new Estudiante("Juan", 10, "asd123");
	}
	
	@Test
	void testNombre() {
	String nombre = estudiante.getNombre();
	assertEquals("Juan", nombre);
	}
	
	
}
