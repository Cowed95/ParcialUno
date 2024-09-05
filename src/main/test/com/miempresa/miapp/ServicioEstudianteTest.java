package main.test.com.miempresa.miapp;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import main.java.com.miempresa.miapp.Estudiante;
import main.java.com.miempresa.miapp.EstudiantesRegistrados;
import main.java.com.miempresa.miapp.ServicioEstudiante;

class ServicioEstudianteTest {

	Estudiante estudiante;
	ServicioEstudiante servicioEstudiante;
	EstudiantesRegistrados estudiantesRegistrado;
	
	@BeforeEach
	void antes() {
		estudiante = new Estudiante("Juan", 20, "asd123");
		estudiantesRegistrado = Mockito.mock(EstudiantesRegistrados.class);
        servicioEstudiante = new ServicioEstudiante(estudiantesRegistrado);
	}
	
	@Test
	void testEstudianteRegistrado() {
		when(estudiantesRegistrado.buscarPorMatricula("asd123")).thenReturn(estudiante);
		
		boolean resultado = servicioEstudiante.esEstudianteRegistrado("asd123");
        assertTrue(resultado);

        verify(estudiantesRegistrado).buscarPorMatricula("asd123");
		

	}
	
	@Test
	void testActualizarEstudiante() {
		Estudiante estudianteActualizar = new Estudiante("Carlos", 21, "qwe123");
		
		when(estudiantesRegistrado.actualizarEstudiante(null, estudiante));
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

}
