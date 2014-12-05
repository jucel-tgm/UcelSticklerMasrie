/**
 * Klasse die Fläche berechnet
 * 
 * @author Oliver Masrie
 * @version 2014-12-04
 */

public class Flaeche {
	private double a, b, c, r; //Attribute für die Flächenberechnung
	/**
	 * Konstruktor für Rechtecke
	 * @param a - Seite a
	 * @param b - Seite b
	 */
	public flaeche(double a, double b) {
		this.a = a; 
		this.b = b;
	}
	/**
	 * Konstruktor für die Rechtecksflächenberechnung
	 * @param a Seite a
	 * @param b Seite b
	 * @param c Seite c
	 */
	public flaeche(double a, double b, doublce c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	/**
	 * Konstruktor für die Dreiecksflächenberechnung
	 * @param r - Radius
	 */
	public flaeche(double r){
		this.r = r;
	/**
	 * Methode zum Berechnen der Rechtecksfläche
	 */
	public double rechteckA() {
		return a*b;
	}
	/**
	 * Methode zum Berechnen der Kreisfläche
	 */
	public kreisA(){
		return Math.PI*r*r;
	}
	/**
	 * Methode zum Berechnen der Dreieicksfläche
	 */
	public dreieckA(){
		double s = (a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}