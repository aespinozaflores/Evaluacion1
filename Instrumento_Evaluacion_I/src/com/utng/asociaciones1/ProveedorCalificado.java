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
public class ProveedorCalificado {
	private Date fechaCalificacion;
	private int cal_ID;
	private int pr_ID;
	

	private List<Calificacion> calificaciones;

	/**
	 * 
	 */
	public ProveedorCalificado(List<Calificacion> calificaciones) {
		// TODO Auto-generated constructor stub
	this.calificaciones= calificaciones;
	}

}
