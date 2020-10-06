import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ComplexTest {
	
	public static void main(String[] args) {
		Complex num1 = new Complex(3,7);
		Complex num2 = new Complex(8,11);
		Complex num3 = Complex.sumComplex(num1,num2);
		System.out.println("Num 1 = "+ num1.getReal() + "+" + num1.getImg() +"i");
		System.out.println("Num 2 = "+ num2.getReal() + "+" + num2.getImg() +"i");
		System.out.println("Sum = "+ num3.getReal() + "+" + num3.getImg() +"i");
	}

	Complex number = new Complex(2f,7.5f);
	
	@Test
	void test1() {
		assertEquals(2,number.getReal());
		assertEquals(7.5,number.getImg());
	}

	@Test
	void test2() {
		Complex number2=new Complex(5.0f,4.3f);
		Complex number3=Complex.sumComplex(number,number2);
		String str=""+number3.getReal()+"+"+number3.getImg()+"i";
		assertEquals("7.0+11.8i",str);
		
	}

}
