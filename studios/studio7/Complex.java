package studio7;

public class Complex {

	private double real;
	private double imaginary;
	private double realIn;
	private double imaginaryIn;

	public Complex(double real, double imaginary, double realIn, double imaginaryIn) {
		this.real = real;
		this.imaginary = imaginary;
		this.realIn = realIn;
		this.imaginaryIn = imaginaryIn;
	}

	public double sumReal() {
		return (real + realIn);
	}

	public double sumImaginary() {
		return (imaginary + imaginaryIn);
	}

	public double realMult() {
		return (((real * realIn) - (imaginary * imaginaryIn)));
	}

	public double realImaginary() {
		return (((real * imaginaryIn) + (realIn * imaginary)));
	}

		
}
