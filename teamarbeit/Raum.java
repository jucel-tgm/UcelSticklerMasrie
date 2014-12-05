
/**
 * Raumberechnungen
 * @author Matthias Stickler
 * @version 1.0
 */
public class Raum {
	private double a;
	private double b;
	private double h;
	private double r;
	public Raum(){
		new Raum();
	}
	public Raum(double seitea, double seiteb, double hoehe, double radius){
		this.a=seitea;
		this.b=seiteb;
		this.h=hoehe;
		this.r=radius;
	}
	/**
	 * Volumen der Pyramide berechnen
	 * @return
	 */
	public double pyramide() {
		return ((a*a)*h)/3;
	}
	/**
	 * Volumen des Kegels berechnen
	 * @return
	 */
	public double kegel() {
		return (Math.PI*(r*r))/3;
	}
	/**
	 * Volumen des Quaders berechnen
	 * @return
	 */
	public double quader() {
		return a*b*h;
	}
}
