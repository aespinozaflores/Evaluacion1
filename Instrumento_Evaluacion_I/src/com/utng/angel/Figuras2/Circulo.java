/**
 * 
 */
package com.utng.angel.Figuras2;

/**
 * @author angel
 *
 */
public class Circulo extends Figura{
	private double radio;
	private double pi;

	/**
	 * @param radio 
	 * 
	 */
	public Circulo(String string) {
		pi=3.1416;	
		// TODO Auto-generated constructor stub
	}

	public double getRadio() {
		return radio;
	}
	
	public void setRadio(double radio){
		this.radio= radio;
	}
	@Override
	public void area(){
		super.area=radio*(pi*pi);
		System.out.println("El circulo tiene un area de:"+area);

	}
	
}
