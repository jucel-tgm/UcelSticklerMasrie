package teamarbeit;

/**
 * Klasse die Fläche berechnet
 * 
 * @author Oliver Masrie
 * @version 2014-12-04
 */

public class Flaeche {
	private double a, b, c, r; // Attribute für die Flächenberechnung

	/**
	 * Konstruktor für Rechtecke
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
	 * Konstruktor für die Rechtecksflächenberechnung
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
	 * Konstruktor für die Dreiecksflächenberechnung
	 * 
	 * @param r
	 *            - Radius
	 */
	public Flaeche(double r) {
		this.r = r;
	}

	/**
	 * Methode zum Berechnen der Rechtecksfläche
	 */
	public double rechteckA() {
		return a * b;
	}

	/**
	 * Methode zum Berechnen der Kreisfläche
	 */
	public double kreisA() {
		return Math.PI * r * r;
	}

	/**
	 * Methode zum Berechnen der Dreieicksfläche
	 */
	public double dreieckA() {
		double s = (a + b + c) / 2;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}
}