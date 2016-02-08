/**
 * 
 */
package com.utng.asociaciones1;

import java.util.List;
import java.util.ArrayList;

/**
 * @author angel
 *
 */
//Atributos de la clase Proveedor
public class Proveedor {
	private double pr_ID;
	private String pr_RazonSocial;
	private String pr_contacto;
	private String pr_telefono1;
	private Short pr_telefono2;
	private Short pr_fax;
	private String pr_email1;
	private String pr_email2;
	private String pr_web;
	private int pr_CUIT;
	//Agregacion de la clase Direccion
	private Direccion direccion;
	 
	//Lista de Rubros
	private List <Rubro> rubros;
	
	private Precios pr= new Precios();
	private List<Articulo> requiere = new ArrayList<Articulo>();
	private Calificacion cal= new Calificacion();

	/**
	 * Constructor de la clase Proveedor
	 */
	public Proveedor(List<Rubro> rubros, Direccion direccion) {
		// TODO Auto-generated constructor stub
		this.rubros = rubros;
		this.direccion = direccion;
	}
}
