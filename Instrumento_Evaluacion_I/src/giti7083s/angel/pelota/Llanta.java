/**
 * 
 */
package giti7083s.angel.pelota;

/**
 * @author angel
 *
 */
public class Llanta implements Rebotable{
	private int redondez;
	/**
	 * 
	 */
	public Llanta(String string) {
		// TODO Auto-generated constructor stub
	}
	public void setRedondez(int redondez) {
		this.redondez = redondez;
	}
	public int getRedondez() {
		return redondez;
	}
	@Override
	public void rebotar() {
		// TODO Auto-generated method stub
		System.out.println("La llanta esta rebotando");
	}
	@Override
	public void setFactorRebote(int fr) {
		// TODO Auto-generated method stub
		
	}

}
