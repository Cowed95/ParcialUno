package main.test.com.miempresa.miapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import main.java.com.miempresa.miapp.Estudiante;
import main.java.com.miempresa.miapp.EstudiantesRegistrados;
import main.java.com.miempresa.miapp.ServicioEstudiante;

class ServicioEstudianteTest {

	Estudiante estudiante;
	ServicioEstudiante servicioEstudiante;
	EstudiantesRegistrados estudianteRegistrado;
	
	@BeforeEach
	void antes() {
		estudiante = new Estudiante("Juan", 20, "asd123");
		servicioEstudiante = new ServicioEstudiante(estudianteRegistrado);
		estudianteRegistrado = Mockito.mock(estudianteRegistrado.getClass());
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
	
	@Test
	void testMatricula() {
		String matricula = estudiante.getMatricula();
		assertEquals("asd123", matricula);
	}
	
	@Test
    void testConstructor() {
        assertEquals("Juan", estudiante.getNombre());
        assertEquals(20, estudiante.getEdad());
        assertEquals("asd123", estudiante.getMatricula());
    }
	
	@Test
	void testEsEstudianteRegistrado() {
		boolean estudianteRegistrado = Ser
	}

}
