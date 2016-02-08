/**
 * 
 */
package giti7083s.angel.pelota;

/**
 * @author angel
 *
 */
public abstract class Pelota implements Rebotable{
	private int redondez;

	/**
	 * 
	 */
	public Pelota() {
		// TODO Auto-generated constructor stub
	}
	//implementacion de metodos de la interfaz Rebotable
	public void setRedondez(int redondez) {
		this.redondez = redondez;
	}
	public int getRedondez() {
		return redondez;
	}
}
