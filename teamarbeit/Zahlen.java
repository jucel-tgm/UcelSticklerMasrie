package teamarbeit;
import java.util.Collections;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * Klasse zur Berechnung des Maximums, Minimums und der Summe;
 * 
 * @author Johannes Ucel
 * @version 04.12.2014
 *
 */
public class Zahlen {
	private LinkedList<Double> num;

	/**
	 * Konsturktor zum Erzeugen der LinkedList
	 */
	public Zahlen() {
		num = new LinkedList<Double>();
	}

	/**
	 * Methode zum Adden einer Zahl
	 * 
	 * @param value
	 *            - Zahl die der Liste hinzugefügt wird
	 */
	public void add(Double value) {
		num.add(value);
	}

	/**
	 * Methode zum Berechnen der Summe
	 * 
	 * @return die Summe
	 */
	public double summe() {
		double sum = 0;
		for (Double d : num)
			sum += d;
		return sum;
	}

	/**
	 * Methode zum Ermitteln des Maximums
	 * 
	 * @return Das Maximum
	 * @throws NoSuchElementException
	 *             Falls die Liste leer ist
	 */
	public double maximum() throws NoSuchElementException {
		return Collections.max(num);
	}

	/**
	 * Methode zum Ermitteln des Minimums
	 * 
	 * @return Das Minimum
	 * @throws NoSuchElementException
	 *             Falls die Liste leer ist
	 */
	public double minimum() throws NoSuchElementException {
		return Collections.min(num);
	}
}
