/**
 * 
 */
package angel.giti7083s.acciones;

/**
 * @author angel
 *
 */
public class Hombre extends Humano{
	private String nombre;

	/**
	 * 
	 */
	public Hombre(String nombre,String genero, String tipoBaile, String tipoInstrumento, 
									String subject, String lugarTrabajo) {
		// TODO Auto-generated constructor stub
		super.genero = genero;
		super.tipoBaile = tipoBaile;
		super.tipoInstrumento = tipoInstrumento;
		super.subject = subject;
		super.lugarTrabajo = lugarTrabajo;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	
	}
	@Override
	public void bailar() {
		// TODO Auto-generated method stub	
		System.out.println("El baila:"+tipoBaile);	
	}

	@Override
	public void tocarInstrumentos() {
		// TODO Auto-generated method stub
		System.out.println("El toca:"+tipoInstrumento);		
	}

	@Override
	public void estudiar() {
		// TODO Auto-generated method stub
		System.out.println("El estudia:"+subject);	
	}

	@Override
	public void trabajar() {
		// TODO Auto-generated method stub
		System.out.println("El trabaja en:"+lugarTrabajo);
	}
}
