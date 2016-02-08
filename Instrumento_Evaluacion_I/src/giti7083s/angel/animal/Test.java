/**
 * 
 */
package giti7083s.angel.animal;

/**
 * @author angel
 *
 */
public class Test {

	/**
	 * 
	 */
	public Test() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creación de nueva instancia de la clase Perro
		Animal rufo = new Perro("Rufo");
		rufo.tipoAnimal();
		rufo.comunicarse();
		System.out.println();			
	
		// Creación de nueva instancia de la clase Gato
		Animal tom = new Gato("Tom");
		tom.tipoAnimal();
		tom.comunicarse();
		System.out.println();
	}

}
