package teamarbeit;

/**
 * Klasse die Fl�che berechnet
 * 
 * @author Oliver Masrie
 * @version 2014-12-04
 */

public class Flaeche {
	private double a, b, c, r; // Attribute f�r die Fl�chenberechnung

	/**
	 * Konstruktor f�r Rechtecke
	 * 
	 * @param a
	 *            - Seite a
	 * @param b
	 *            - Seite b
	 */
	public Flaeche(double a, double b) {
		this.a = a;
		this.b = b;
	}

	/**
	 * Konstruktor f�r die Rechtecksfl�chenberechnung
	 * 
	 * @param a
	 *            Seite a
	 * @param b
	 *            Seite b
	 * @param c
	 *            Seite c
	 */
	public Flaeche(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	/**
	 * Konstruktor f�r die Dreiecksfl�chenberechnung
	 * 
	 * @param r
	 *            - Radius
	 */
	public Flaeche(double r) {
		this.r = r;
	}

	/**
	 * Methode zum Berechnen der Rechtecksfl�che
	 */
	public double rechteckA() {
		return a * b;
	}

	/**
	 * Methode zum Berechnen der Kreisfl�che
	 */
	public double kreisA() {
		return Math.PI * r * r;
	}

	/**
	 * Methode zum Berechnen der Dreieicksfl�che
	 */
	public double dreieckA() {
		double s = (a + b + c) / 2;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}
}