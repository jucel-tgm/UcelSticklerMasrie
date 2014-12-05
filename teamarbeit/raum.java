
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
	public raum(){
		new raum();
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
