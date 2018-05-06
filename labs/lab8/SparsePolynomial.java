package lab8;

import java.util.HashSet;
import java.util.Set;

import sedgewick.StdDraw;

/**
 * An immutable Polynomial class. This means that once the constructor has
 * finished, nothing about this Polynomial can change. We check for this in our
 * testing of your implementation.
 * 
 * Also this implementation is sparse, in the sense that terms with 0
 * coefficients, supplied or implied, can and should not be represented here.
 * 
 * For example, 5 + x^100 is a Polynomial with a 0-degree term (5) and a
 * 100-degree term (1). The 99 terms in between are not mentioned here and are
 * implied to have a coefficient of 0. Moreover, x^202 power would also have a
 * coefficient of 0 for this Polynomial. By using a sparse representation, we
 * retain only the 0-degree and 100-degree terms in this case.
 * 
 * @author Pranav Maddula
 *
 */
public class SparsePolynomial implements Polynomial {

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((s == null) ? 0 : s.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SparsePolynomial other = (SparsePolynomial) obj;
		if (s == null) {
			if (other.s != null)
				return false;
		} else if (!s.equals(other.s))
			return false;
		return true;
	}

	private final Set<Term> s;

	/**
	 * Primary constructor
	 * 
	 * @param array
	 *            collection of Terms for this Polynomial. Some coefficients may be
	 *            0.0, but those Terms should not be retained in the Set.
	 */

	public SparsePolynomial(Term[] array) {

		this.s = new HashSet<>();

		for (Term t : array) {
			if (t.getCoefficient() != 0) {
				s.add(t);
			}
		}

	}

	/**
	 * This is completed already for you. Do not change this constructor.
	 * Convenience constructor to create an empty Polynomial. Calls the primary
	 * constructor passing an empty array of Terms.
	 */
	public SparsePolynomial() {
		this(new Term[0]);
	}

	/**
	 * This is provided for you. Really, no need to thank me.
	 */
	@Override
	public void plot(double lowx, double highx, double incx) {
		//
		// Determine min and max for y values
		//
		double maxy = this.evaluate(lowx);
		double miny = this.evaluate(lowx);
		for (double x = lowx; x < highx; x = x + incx) {
			double y = this.evaluate(x);
			maxy = Math.max(maxy, y);
			miny = Math.min(miny, y);
		}
		StdDraw.setXscale(lowx, highx);
		StdDraw.setYscale(miny, maxy);
		for (double x = lowx; x < highx; x = x + incx) {
			double y = this.evaluate(x);
			StdDraw.point(x, y);
		}
	}

	/**
	 * Output degree
	 */
	@Override
	public int degree() {
		int max = 0;
		for (Term t : s) { // loop through term to find max degree
			if (t.getDegree() > max) {
				max = t.getDegree(); // return max degree
			}
		}
		return max;
	}

	/**
	 * output coeffeciant at degree
	 */
	@Override
	public double getCoefficientAtDegree(int degree) {
		double out = 0;
		for (Term t : s) { // loop through term to find coeffeciant at given degree
			if (t.getDegree() == degree) {
				out = t.getCoefficient(); // return coeffeciant
			}
		}
		return out;
	}

	/**
	 * find eavluation of polynomial
	 */
	@Override
	public double evaluate(double x) {
		double sum = 0;
		for (Term t : s) { // find vals of all points and add together
			sum = sum + t.evaluateTermAtX(x);
		}
		return sum;
	}

	/**
	 * output dense array
	 */
	@Override
	public Term[] toArray() {
		Term[] array = new Term[degree() + 1];
		int i = 0;
		for (Term t : s) {
			i = t.getDegree(); // find degree of each known point
			array[i] = t;
		}
		for (int j = 0; j < array.length; j++) {
			if (array[j] == null) { // if term is not found (0) set coeffeciant to be zero and set power to pos in
									// loop
				array[j] = new Term(0, j);
			}
		}
		return array;
	}

	/**
	 * output polynomial of derivative
	 */
	@Override
	public Polynomial derivative() {
		Term[] array = toArray(); // gens dense array
		Term[] deriv = new Term[degree()]; // gens new array with spots equal to degree = n-1 due to derivitive
		for (int i = 0; i < deriv.length; i++) {
			int n = i + 1;
			deriv[i] = new Term(array[n].getCoefficient() * array[n].getDegree(), array[n].getDegree() - 1); // finds
																												// derivitive
																												// for
																												// each
																												// val
																												// in
																												// array,
																												// a*x^n
																												// ->
																												// a*n*x^(n-1)
		}
		Polynomial sparse = new SparsePolynomial(deriv); // gens new sparse polynomial from arrray
		return sparse;
	}

	/**
	 * output sum of two polynomials - append
	 */
	@Override
	public Polynomial sum(Polynomial other) {

		Term[] array1 = toArray(); // finds dense array for summing all vals
		Term[] array2 = other.toArray();

		int length1 = array1.length; // lengths of arrays
		int length2 = array2.length;

		Term[] sum = new Term[length1 + length2];
		for (int i = 0; i < length1; i++) { // Sums values in first array to new array
			sum[i] = array1[i];
		}
		int i = 0;
		for (int j = length1; j < sum.length; j++) {
			sum[j] = array2[i]; // sums values in second array, that are not in first array to new array
			i++;
		}
		Polynomial p = new SparsePolynomial(sum); // gens sparse polynomial
		return p;
	}

	@Override
	public Polynomial addTerm(Term t) {
		Term[] array = toArray();
		Term[] add = new Term[array.length + 1]; // gens new array with length of one more
		for (int i = 0; i < array.length; i++) { // loops through the array to copy old vals over
			add[i] = array[i];
		}
		add[add.length - 1] = t; // adds new term to final location of array
		Polynomial sparse = new SparsePolynomial(add); // gens sparse paolynomial
		return sparse;
	}

}
