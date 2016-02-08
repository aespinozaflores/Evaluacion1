/**
 * 
 */
package com.utng.angel.Figuras2;

/**
 * @author angel
 *
 */
public class TestFiguras2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Circulo c2= new Circulo("c2");
		c2.setRadio(3.2);	
		c2.getRadio();
		c2.area();
		
		Cuadrado cuadrado1 = new Cuadrado("cuadrado1");
			cuadrado1.setLado(9);
			cuadrado1.area();
	}

}
