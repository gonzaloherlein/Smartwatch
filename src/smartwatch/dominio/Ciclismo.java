package smartwatch.dominio;

public class Ciclismo extends Disciplina {
	private Double velocidad;
	private ZonaDeFrecuencia zonaFrecuenciaCardiaca;
	private Integer cadencia;
	
	public Ciclismo() {
		
	}
	
	public Ciclismo(Double distanciaRecorrida, Integer tiempoTranscurrido,Double velocidad,ZonaDeFrecuencia zonaFrecuenciaCardiaca,
			Integer cadencia) {
		super(distanciaRecorrida, tiempoTranscurrido);
		this.velocidad = velocidad;
		this.zonaFrecuenciaCardiaca = zonaFrecuenciaCardiaca;
		this.cadencia = cadencia;
	}
	
	
}
