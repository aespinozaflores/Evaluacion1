/**
 * 
 */
package com.utng.asociaciones1;

import java.util.List;

/**
 * @author angel
 * Clase Articulo
 */
public class Articulo {
	private String art_ID;
	private String art_Descripcion;
	private int art_estado;
	private int art_tipo;
	private int art_cantidad;
	private double art_cantidadCritica;
	private double art_cantidadMinima;
	//Agregacion de la clase rubros
		private List<Rubro> rubros;

	/**
	 * 
	 */
	public Articulo(List<Rubro> rubros) {
		// TODO Auto-generated constructor stub
		this.rubros = rubros;
	}
	private Precios vale = new Precios();
	
}
