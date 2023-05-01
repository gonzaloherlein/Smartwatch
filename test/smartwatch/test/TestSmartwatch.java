package smartwatch.test;

import static org.junit.Assert.*;

import org.junit.Test;

import smartwatch.dominio.Caminata;
import smartwatch.dominio.Carrera;
import smartwatch.dominio.Ciclismo;
import smartwatch.dominio.Deportista;
import smartwatch.dominio.Disciplina;
import smartwatch.dominio.Natacion;

public class TestSmartwatch {

	@Test
	public void queSeCreeUnDeportista(){
		Deportista deportista = new Deportista();
		assertNotNull(deportista);
	}

	@Test
	public void queSeCreeUnaDisciplina(){
		Disciplina disciplina= new Disciplina();
		assertNotNull(disciplina);
	}
	
	@Test
	public void queSeCreeUnCarrera(){
		Disciplina carrera= new Carrera();
		assertNotNull(carrera);
	}
	
	@Test
	public void queSeCreeUnCiclismo(){
		Disciplina ciclismo= new Ciclismo();
		assertNotNull(ciclismo);
	}
	
	@Test
	public void queSeCreeUnaNatacion(){
		Disciplina natacion= new Natacion();
		assertNotNull(natacion);
	}
	
	@Test
	public void queSeCreeUnaCaminata(){
		Disciplina caminata= new Caminata();
		assertNotNull(caminata);
	}
}
