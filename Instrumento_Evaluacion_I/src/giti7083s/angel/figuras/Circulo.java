package giti7083s.angel.figuras;

public class Circulo extends Figura {
	Punto centro= null;
	private double radio;
	private double pi;

	public Circulo(String string) {
		// TODO Auto-generated constructor stub
	pi= 3.1416;
	radio = 0.0;
	}

	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	@Override
	public void calcularPerimetro() {
		// TODO Auto-generated method stub
		perimetro = pi*(2*radio);
		System.out.println("El perimetro del circulo es: "+perimetro);
}

	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		area = pi*(radio*radio);
		System.out.println("El área del circulo es: "+area);
	}
}