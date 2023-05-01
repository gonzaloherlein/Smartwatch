package smartwatch.dominio;

public class Deportista {
	private String nombre;
	private Integer edadActual;
	private Double pesoActual;
	private Integer alturaActual;
	private Integer pasosDiarios;
	
	public Deportista() {
		
	}
	
	
	public Deportista(String nombre, Integer edadActual, Double pesoActual, Integer alturaActual,
			Integer pasosDiarios) {
		this.nombre = nombre;
		this.edadActual = edadActual;
		this.pesoActual = pesoActual;
		this.alturaActual = alturaActual;
		this.pasosDiarios = pasosDiarios;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Integer getEdadActual() {
		return edadActual;
	}


	public void setEdadActual(Integer edadActual) {
		this.edadActual = edadActual;
	}


	public Double getPesoActual() {
		return pesoActual;
	}


	public void setPesoActual(Double pesoActual) {
		this.pesoActual = pesoActual;
	}


	public Integer getAlturaActual() {
		return alturaActual;
	}


	public void setAlturaActual(Integer alturaActual) {
		this.alturaActual = alturaActual;
	}


	public Integer getPasosDiarios() {
		return pasosDiarios;
	}


	public void setPasosDiarios(Integer pasosDiarios) {
		this.pasosDiarios = pasosDiarios;
	}
	
	
}
