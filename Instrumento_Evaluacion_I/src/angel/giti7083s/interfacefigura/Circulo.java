/**
 * 
 */
package angel.giti7083s.interfacefigura;

/**
 * @author angel
 *Clase Circulo
 */
public class Circulo implements Figura{
	private double pi;
	private double radio;
	private double area;

	/**
	 * constructor de la clase Circulo
	 */
	public Circulo(String string) {
		// TODO Auto-generated constructor stub
	pi= 3.1416;
	}
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	@Override
	public void area(){
		area=pi*(radio*radio);
		System.out.println("La figura es un circulo");
		System.out.println("Su area es: "+area);
	}
}
