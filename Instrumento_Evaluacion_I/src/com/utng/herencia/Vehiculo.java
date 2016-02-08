package com.utng.herencia;

public class Vehiculo {
	private String duenio;
	private int puertas;
	private int ruedas;
	

	public Vehiculo() {
		// TODO Auto-generated constructor stub
	}
	
	public void caracteristicas(){
		System.out.println("Numero de puertas"+puertas);
		
	}

	public String getDuenio() {
		return duenio;
	}

	public void setDuenio(String duenio) {
		this.duenio = duenio;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
	
}

