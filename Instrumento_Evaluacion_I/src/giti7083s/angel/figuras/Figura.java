package giti7083s.angel.figuras;
/***
 * 
 * @author angel
 * Clase abstracta Figura
 */
public abstract class Figura {
	protected double perimetro;
	protected double area;

	
	public Figura() {
		// TODO Auto-generated constructor stub
	}
	//Metodos abstractos que seran utilizados por las subclases
	public abstract void calcularPerimetro();	
	public abstract void calcularArea();
	
}
