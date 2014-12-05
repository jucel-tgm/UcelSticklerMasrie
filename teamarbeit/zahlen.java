import java.util.Collections;
import java.util.LinkedList;

/**
 * Klasse zur Berechnung des Maximums, Minimums und der Summe;
 * 
 * @author Johannes Ucel
 * @version 04.12.2014
 *
 */
public class Zahlen {
	private LinkedList<Double> num;

	public Zahlen() {
		num = new LinkedList<Double>();
	}

	public void add(Double value) {
		num.add(value);
	}

	public double summe() {
		double sum = 0;
		for (Double d : num)
			sum += d;
		return sum;
	}

	public double maximum() {
		return Collections.max(num);
	}

	public double minimum() {
		return Collections.min(num);
	}
}
