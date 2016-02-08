package giti7083s.angel.animal;
/***
 * 
 * @author angel
 * Clase gato
 */
public class Gato extends Animal {

	public Gato(String nombre) {
		// TODO Auto-generated constructor stub
		//propiedad heredada de la superClase Animal
		super(nombre);
		System.out.println("Nombre: "+nombre);
	}
	@Override
	public void tipoAnimal() {
		// TODO Auto-generated method stub
		// Aqui se define el método abstracto tipoAnimal, de la clase Animal
		System.out.println("Tipo de animal: Gato");
		
	}
	@Override
	public void comunicarse(){
		// Aqui se define el método abstracto comunicarse, de la interfaz IAnimal
		System.out.println("El gato hace: Miau Miau!");
	}

}
