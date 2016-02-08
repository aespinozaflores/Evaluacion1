/**
 * 
 */
package angel.giti7083s.canino;

/**
 * @author angel
 *
 */
public abstract class Animal {
	private String foto;
	private String tipo_Commida;
	private String localzacion;
	private String tamanio;
	/**
	 * 
	 */
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	public abstract void hacerRuido();
	public abstract void comer();
	public abstract void dormir();
	public abstract void rugir();
	
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getTipo_Commida() {
		return tipo_Commida;
	}
	public void setTipo_Commida(String tipo_Commida) {
		this.tipo_Commida = tipo_Commida;
	}
	public String getLocalzacion() {
		return localzacion;
	}
	public void setLocalzacion(String localzacion) {
		this.localzacion = localzacion;
	}
	public String getTamanio() {
		return tamanio;
	}
	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
}
