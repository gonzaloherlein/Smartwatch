package smartwatch.dominio;

public class Disciplina {
	private Double distaciaRecorrida;
	private Integer tiempoTranscurrido;
	
	public Disciplina() {
		
	}
	
	public Disciplina(Double distanciaRecorrida, Integer tiempoTranscurrido) {
		this.distaciaRecorrida = distanciaRecorrida;
		this.tiempoTranscurrido = tiempoTranscurrido;
	}
}
