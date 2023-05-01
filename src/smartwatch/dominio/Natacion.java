package smartwatch.dominio;

public class Natacion extends Disciplina {
	private Integer ritmo;

	public Natacion() {
		
	}

	public Natacion(Double distanciaRecorrida, Integer tiempoTranscurrido, Integer ritmo) {
		super(distanciaRecorrida, tiempoTranscurrido);
		this.ritmo = ritmo;
	}
	
}
