/**
 * 
 */
package com.utng.ayc;

/**
 * @author angel
 * Clase coche.s
 */
public class Coche {
	private Motor m;
	private String marca;

	/**
	 * constructor de la Clase coche
	 */
	public Coche(Motor m) {
		// TODO Auto-generated constructor stub
		this.m = m;
	}
	/**
	 * @return la marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
		
	//Metodos de la clase Coche
	}
	
	public void enciende() {

	}

	public void acelera() {

	}

	public void apaga() {

	}

	public void frena() {

	}
	//Asignacion de uno a uno con la clase Persona
	public void asignarPersona(Persona p){
	p = new Persona("");
	}
	public boolean estaEncendido(){
		return true;
	}

}
