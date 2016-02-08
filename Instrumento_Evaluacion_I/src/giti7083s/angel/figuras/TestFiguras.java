/**
 * 
 */
package giti7083s.angel.figuras;

/**
 * @author angel
 *
 */
public class TestFiguras {

	/**
	 * 
	 */
	public TestFiguras() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creación de instancia de circulo1
		
		Circulo circulo1 = new Circulo("circulo1");
		circulo1.setRadio(3.5);
		circulo1.calcularPerimetro();
		circulo1.calcularArea();
		
		//Creación de instancia de circulo2
		
				Circulo circulo2 = new Circulo("circulo2");
				circulo2.setRadio(15);
				circulo2.calcularPerimetro();
				circulo2.calcularArea();
	}

}
