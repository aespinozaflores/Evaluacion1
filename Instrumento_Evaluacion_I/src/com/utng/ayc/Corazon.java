/**
 * 
 */
package com.utng.ayc;

/**
 * @author angel
 *
 */
public class Corazon {
	private int ritmo;

	/**
	 * 
	 */
	public Corazon() {
		// TODO Auto-generated constructor stub
	}
	
	public void setRitmo(int ritmo){
	this.ritmo= ritmo; 
	}
	public int getRitmo(){
		return ritmo;
	}
	public void cambiarRitmo(int ritmo){
		
	}
	public void leeRitmo(){
		System.out.println("El ritmo es de: "+ritmo+" pulsaciones por minuto" );
	}

}
