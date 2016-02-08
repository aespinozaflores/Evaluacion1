/**
 * 
 */
package angel.giti7083s.interfacefigura;

/**
 * @author angel
 *Clase cuadrado
 */
public class Cuadrado implements Figura{
	private double lado;
	private double area;

	/**
	 * 
	 */
	public Cuadrado(String string) {
		// TODO Auto-generated constructor stub
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public void area() {
		// TODO Auto-generated method stub
		area= lado*lado;
		System.out.println("La figura es un cuadrado");
		System.out.println("Su area es: "+area);
	}

}
