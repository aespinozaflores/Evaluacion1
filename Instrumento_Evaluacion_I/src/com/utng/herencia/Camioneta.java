package com.utng.herencia;

public class Camioneta extends Vehiculo{
	private float tara;
	private float carga;
	private float kilos = 0;

	public Camioneta(String string) {
		// TODO Auto-generated constructor stub
		//Constructor de la clase Camioneta
	}

	public float getTara() {
		return tara;
	}

	public void setTara(float tara) {
		this.tara = tara;
	}

	public float getCarga() {
		return carga;
	}


	public void setCarga(float carga) {
		this.carga = carga;
	}
	public void caracteristicas(){
		super.caracteristicas();
	}
	public void cargar(){
	carga = kilos;
	}
}
