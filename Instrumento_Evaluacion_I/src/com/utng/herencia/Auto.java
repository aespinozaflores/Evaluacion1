package com.utng.herencia;

public class Auto extends Vehiculo {
	private boolean descapotable = false;
	

	public Auto(String string) {
		// TODO Auto-generated constructor stub	
	}
	public void caracteristicas(){
		super.caracteristicas();
	}
	//Describe si el auto es decapotable o no. por defecto no lo es.
	public void isDescapotable() {
		if(descapotable=false){
		System.out.println("El auto no es descapotable");
		}else{
			System.out.println("El auto es descapotable");
		}
		
	}
	public void setDescapotable(boolean descapotable) {
		this.descapotable = descapotable;
	}
	public boolean isDecapotable(){
		return descapotable;
	}
	public void subir(){
		System.out.println("El auto está bajando");
	}
	public void bajar(){
		System.out.println("El auto está subiendo");
	}
	
	
}
