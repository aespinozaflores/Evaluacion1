/**
 * 
 */
package com.utng.asociaciones1;

import java.util.Date;
import java.util.List;

/**
 * @author angel
 *
 */
public class Pedido {
	private double pe_id;
	private Date pe_fechaPedido;
	private Date pe_fechaNecesidad;
	private Date pe_fechaProgramada;
	private Date pe_fechaEntrega;
	private int pe_estado;

	//Agregacion de la clase articulo
	private List<Articulo> articulos;
	/**
	 * 
	 */
	public Pedido(List<Articulo> articulos) {
		// TODO Auto-generated constructor stub
	this.articulos = articulos;
	}
	

}
