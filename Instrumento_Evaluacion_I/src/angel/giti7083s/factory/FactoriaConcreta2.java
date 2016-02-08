/**
 * 
 */
package angel.giti7083s.factory;

/**
 * @author angel
 *
 */
public class FactoriaConcreta2 implements AbstractFactory{

	/**
	 * 
	 */
	public FactoriaConcreta2() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public void crearProductoA() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void crearProductoB() {
		// TODO Auto-generated method stub
		
	}
	
	public void main(String[] args){
		ProductoA2 pa2= new ProductoA2("pa2");
		ProductoB2 pb2= new ProductoB2("pb2");
		
	}

}
