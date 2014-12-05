package teamarbeit;

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
	/**
	 * Standardkonstruktor
	 */
	public Raum(){
		new Raum();
	}
	/**
	 * Konstruktor um die benötigten Variablen mitzugeben
	 * @param seitea - Seite A
	 * @param seiteb - Seite B
	 * @param hoehe - die Hoehe
	 * @param radius - der Radius
	 */	
	public Raum(double seitea, double seiteb, double hoehe, double radius){
		this.a=seitea;
		this.b=seiteb;
		this.h=hoehe;
		this.r=radius;
	}
	/**
	 * Volumen der Pyramide berechnen
	 * @return Das Volumen
	 */
	public double pyramide() {
		return ((a*a)*h)/3;
	}
	/**
	 * Volumen des Kegels berechnen
	 * @return Das Volumen
	 */
	public double kegel() {
		return (Math.PI*(r*r))/3;
	}
	/**
	 * Volumen des Quaders berechnen
	 * @return das Volumen
	 */
	public double quader() {
		return a*b*h;
	}
}
