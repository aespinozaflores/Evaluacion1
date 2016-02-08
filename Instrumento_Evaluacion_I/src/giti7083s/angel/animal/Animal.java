/**
 * 
 */
package giti7083s.angel.animal;

/**
 * @author angel
 * Clase Abstracta Animal. 
 *
 */
public abstract class Animal implements IAnimal{
	private String nombre;
	

	/**
	 * Constructor Animal.
	 * Obtiene el nombre del animal
	 */
	public Animal(String nombre) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
	}
	public String getNombre() {
		//Retorna el valor de la propiedad nombre
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//Metodo abstracto tipoAnimal
	public abstract void tipoAnimal();
	
}
