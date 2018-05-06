package lab8;

/**
 * Represent an as-yet unevaluated term of a polynomial. A term has-a
 * coefficient, which is a double degree, which is an int
 * 
 * Examples: Given the term 3.27 x squared its coefficient is 3.27 its degree is
 * 2
 * 
 * Given the term 131 its coefficient is 131.0 its degree is 0
 * 
 * @author yournamehere
 *
 */

public class Term {

	private final double cf;
	private final int dg;

	public Term(double coefficient, int degree) {
		this.cf = coefficient;
		this.dg = degree;
	}

	@Override
	public String toString() {
		return "Term: " + cf + "x ^(" + dg + ")";
	}

	public double getCoefficient() {
		return cf;
	}

	public int getDegree() {
		return dg;
	}

	public double evaluateTermAtX(double x) {
		return cf * Math.pow(x, dg);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cf);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + dg;
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
		Term other = (Term) obj;
		if (Double.doubleToLongBits(cf) != Double.doubleToLongBits(other.cf))
			return false;
		if (dg != other.dg)
			return false;
		return true;
	}

}