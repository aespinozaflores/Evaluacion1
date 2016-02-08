/**
 * 
 */
package angel.giti7083s.interfacefigura;

/**
 * @author angel
 *
 */
public class Triangulo implements Figura {
	private double base;
	private double altura; 
	private double area;

	/**
	 * 
	 */
	public Triangulo(String string) {
		// TODO Auto-generated constructor stub
	}

	public void setBase(double base) {
		this.base = base;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getBase() {
		return base;
	}
	public double getAltura() {
		return altura;
	}
	
	@Override
	//Implementacion del metodo area de la interfaz Figura
	public void area(){
		area=(base*altura)/2;
		System.out.println("La figura es un triangulo");
		System.out.println("El area del triangulo es: "+area);

	}
	
}
