/**
 * 
 */
package com.utng.angel.Figuras2;

/**
 * @author angel
 *
 */
public class Cuadrado extends Figura{
	private int lado;

	public Cuadrado(String string) {
		// TODO Auto-generated constructor stub
	}
	public int getLado() {
		return lado;
	}
	public void setLado(int lado) {
		this.lado = lado;
	}
	
	@Override
	public void area() {
		// TODO Auto-generated method stub
		super.area= lado*lado;
		System.out.println("El area del cuadrado es:"+area);
	}
}

