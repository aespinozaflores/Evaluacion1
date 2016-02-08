/**
 * 
 */
package com.utng.angel.Figuras2;

/**
 * @author angel
 *
 */
abstract class Figura {
	
	protected int puntoX;
	protected int puntoY;
	protected double area;
	

	/**
	 * 
	 */
	public Figura() {
		// TODO Auto-generated constructor stub
	}

	public int getPuntoX() {
		return puntoX;
	}
	public int getPuntoY() {
		return puntoY;
	}
	public void setPuntoX(int puntoX) {
		this.puntoX = puntoX;
	}
	public void setPuntoY(int puntoY) {
		this.puntoY = puntoY;
	}
	
	public abstract void area();
	
}
