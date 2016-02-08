/**
 * 
 */
package angel.giti7083s.interfacefigura;

/**
 * @author angel
 *
 */
public class TestInterface {

	/**
	 * 
	 */
	public void TestInterface() {
		// TODO Auto-generated constructor stub
	Figura fig1;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circulo cir1 = new Circulo("cir1");
		cir1.setRadio(4);
		cir1.getRadio();
		cir1.area();
		
		Cuadrado cuad1 = new Cuadrado("cuad1");
		cuad1.setLado(6);
		cuad1.getLado();
		cuad1.area();
		
		Triangulo tr1 = new Triangulo("tr1");
		tr1.setBase(4);
		tr1.setAltura(8);
		tr1.area();
	
	}

}
