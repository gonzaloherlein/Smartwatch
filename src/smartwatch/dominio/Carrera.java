package smartwatch.dominio;

public class Carrera extends Disciplina {
	private Integer ritmo;
	private ZonaDeFrecuencia zonaFrecienciaCardiaca;
	
	public Carrera() {
		
	}
	public Carrera(Double distanciaRecorrida, Integer tiempoTranscurrido, Integer ritmo, ZonaDeFrecuencia zonaFrecienciaCardiaca) {
		super(distanciaRecorrida, tiempoTranscurrido);
		this.ritmo = ritmo;
		this.zonaFrecienciaCardiaca = zonaFrecienciaCardiaca;
	}
	
	
	
	
}
