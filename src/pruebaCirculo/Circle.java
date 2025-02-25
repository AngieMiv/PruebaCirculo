package pruebaCirculo;

public class Circle implements IFiguraGeometrica { // implements interface from method getArea
	final double CERO = 0.0;
	
	private int x;
	private int y;
	private double radio;

	// constructor
	public Circle(int valorX, int valorY, double valorRadio) {
		x = valorX;
		y = valorY;
		setRadio(valorRadio);
	}
	
	// getters
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public double getRadio() {
		return radio;
	}

	// setters
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setRadio(double valorRadio) {
		this.radio = (valorRadio < CERO ? CERO : valorRadio);
	}
	
	public double getDiametro() {return 2 * radio;}
	
	public double getCircunferencia() {return Math.PI * getDiametro();}
	
	@Override
	public double getArea() {return Math.PI * radio * radio;}
	

	@Override
	public String toString() {
		return "Centro = [" + x + ", " + y + "]; Radio = " + radio;
	}
}