public class Complex {
	private float real;
	private float img;
	
	public Complex(float real, float img) {
		super();
		this.real = real;
		this.img = img;
	}
	
	public float getReal() {
		return real;
	}

	public float getImg() {
		return img;
	}

	public static Complex sumComplex(Complex c1, Complex c2) {
		Complex c3 = new Complex(0,0);
		c3.real = c1.real+c2.real;
		c3.img= c1.img+c2.img;
		return c3;
	}
}