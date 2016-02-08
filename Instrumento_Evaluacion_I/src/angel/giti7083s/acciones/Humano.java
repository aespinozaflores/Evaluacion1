/**
 * 
 */
package angel.giti7083s.acciones;

/**
 * @author angel
 *
 */
public class Humano implements AccionesHumano, AccionesSeresVivos{
	protected String genero;
	protected String tipoBaile;
	protected String tipoInstrumento;
	protected String subject;
	protected String lugarTrabajo;
	

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getTipoBaile() {
		return tipoBaile;
	}

	public void setTipoBaile(String tipoBaile) {
		this.tipoBaile = tipoBaile;
	}

	public String getTipoInstrumento() {
		return tipoInstrumento;
	}

	public void setTipoInstrumento(String tipoInstrumento) {
		this.tipoInstrumento = tipoInstrumento;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getLugarTrabajo() {
		return lugarTrabajo;
	}

	public void setLugarTrabajo(String lugarTrabajo) {
		this.lugarTrabajo = lugarTrabajo;
	}

	/**
	 * 
	 */
	public Humano() {
		// TODO Auto-generated constructor stub
	
	}

	@Override
	public void bailar() {
		// TODO Auto-generated method stub	
	}

	@Override
	public void tocarInstrumentos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void estudiar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void trabajar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hablar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void desplazarse() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jugar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alimentarse() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		
	}

}
