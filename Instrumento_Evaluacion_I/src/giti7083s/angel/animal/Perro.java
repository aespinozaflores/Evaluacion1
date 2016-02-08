package giti7083s.angel.animal;
/***
 * 
 * @author angel
 * Clase Perro
 */
public class Perro extends Animal{

	public Perro(String nombre) {
		// TODO Auto-generated constructor stub
		super(nombre);
		System.out.println("Nombre: "+nombre);
	}
	@Override
	public void tipoAnimal(){
		// Aqui se define el cuerpo del método heredado tipoAnimal, de la clase Animal
		System.out.println("Tipo de animal: Perro");
	}
	@Override
	public void comunicarse(){
		// TODO Auto-generated method stub
		// Aquí se define el cuerpo del mètodo heredado comunicarse, de la clase Animal
		System.out.println("El perro hace: Guau! Guau!");
	}
}
