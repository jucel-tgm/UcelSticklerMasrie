package teamarbeit;

/**
 * Raumberechnungen
 * 
 * @author Matthias Stickler
 * @version 1.0
 */
public class Raum {
	private double a;
	private double b;
	private double h;
	private double r;

	/**
	 * Konstruktor für die Pyramide/Quader
	 * 
	 * @param a
	 *            Seite a
	 * @param h
	 *            Höhe h
	 */
	public Raum(double a, double b, double h) {
		this.a = a;
		this.b = b;
		this.h = h;
		this.r = 0;
	}

	/**
	 * Konstruktor für den Kegel
	 * 
	 * @param r
	 *            Radius r
	 * @param h
	 *            Höhe h
	 */
	public Raum(double r, double h) {
		this.a = 0;
		this.b = 0;
		this.h = h;
		this.r = r;

	}

	/**
	 * Volumen der Pyramide berechnen
	 * 
	 * @return Das Volumen
	 */
	public double pyramide() {
		return ((a * b) * h) / 3;
	}

	/**
	 * Volumen des Kegels berechnen
	 * 
	 * @return Das Volumen
	 */
	public double kegel() {
		return (Math.PI * h * (r * r)) / 3;
	}

	/**
	 * Volumen des Quaders berechnen
	 * 
	 * @return das Volumen
	 */
	public double quader() {
		return a * b * h;
	}
}
