/**
 * 
 */
package com.utng.ayc;

/**
 * @author angel
 *
 */
public class Motor {
	private int revolucionesPorMinuto;
	private boolean activo;

	/**
	 * 
	 */
	public Motor() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the revolucionesPorMinuto
	 */
	public int getRevolucionesPorMinuto() {
		return revolucionesPorMinuto;
	}

	/**
	 * @param revolucionesPorMinuto the revolucionesPorMinuto to set
	 */
	public void setRevolucionesPorMinuto(int revolucionesPorMinuto) {
		this.revolucionesPorMinuto = revolucionesPorMinuto;
	}

	/**
	 * Retorna Boleean activo
	 */
	public boolean estaActivo() {
		return activo;
	}

	/**
	 * @param activo the activo to set
	 */
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	public void cambiarRevolucionesPorMinuto(int rpm){
		rpm = revolucionesPorMinuto;
	}
	
	public void activa() {
		activo = true;

	}

	public void desactiva() {
		activo = false;

	}
	
}
