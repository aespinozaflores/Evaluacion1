package angel.giti7083s.mascota;

public class Leon implements Animal {
	private String sonido;

	public Leon() {
		// TODO Auto-generated constructor stub
	}

	
	public String getSonido() {
		return sonido;
	}


	public void setSonido(String sonido) {
		this.sonido = sonido;
	}


	@Override
	public void comer() {
		// TODO Auto-generated method stub

	}
	public void rugir(){
		sonido= "Grrrr, Grrr!";
	System.out.println("El leon hace: "+sonido);	
	}

}
