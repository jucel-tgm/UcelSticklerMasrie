package teamarbeit;

/**
 * Testklasse
 * 
 * @author Johannes Ucel
 * @version 05.12.2014
 *
 */
public class Testclass {
	public static void main(String[] args) {
		// Zahlen Test
		Zahlen z = new Zahlen();
		z.add(3.5);
		z.add(4.0);
		z.add(7.0);
		z.add(5.5);
		System.out.println("Minimum: " + z.minimum());
		System.out.println("Maximum: " + z.maximum());

		// Flächenberechnung Test
		Flaeche f = new Flaeche(2, 4, 5);
		Flaeche f2 = new Flaeche(4);
		Flaeche f3 = new Flaeche(2.4, 4.5);
		System.out.println("Kreisfläche: " + f2.kreisA());
		System.out.println("Rechteckfläche: " + f.rechteckA());
		System.out.println("Dreieckfläche: " + f.dreieckA());

		// Raumberechnung
		Raum r = new Raum(2, 10);
		Raum r2 = new Raum(4.5, 22.2, 5.5);
		System.out.println("Kegel-Volumen: " + r.kegel());
		System.out.println("Pyramide - Volumen:" + r2.pyramide());
		System.out.println("Quader - Volumen: " + r2.quader());
	}
}