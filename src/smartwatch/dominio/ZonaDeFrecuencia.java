package smartwatch.dominio;

public class ZonaDeFrecuencia {
	private Integer frecuenciaCardiacaMinima;
	private Integer frecuenciaCardiacaMaxima;
	
	public ZonaDeFrecuencia() {
		
	}
	
	public ZonaDeFrecuencia(Integer frecuenciaCardiacaMinima, Integer frecuenciaCardiacaMaxima) {
		this.frecuenciaCardiacaMinima = frecuenciaCardiacaMinima;
		this.frecuenciaCardiacaMaxima = frecuenciaCardiacaMaxima;
	}
}
