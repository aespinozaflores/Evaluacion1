/**
 * 
 */
package com.utng.ayc;

/**
 * @author angel
 *
 */
public class Persona {

	private String nombre;
	private String lugarViaje;
	private Corazon cor; 
	
	/**
	 * 
	 */
	public Persona(String nombre) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	public void setLugar(String lugarViaje){
		this.lugarViaje = lugarViaje;
	}
	public String getLugar(){
		return lugarViaje;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void asignaCoche(Coche coche){
		
		
	}
	public void viaja(){
		System.out.println(nombre+" Está viajando a "+lugarViaje);
		
	}

}
