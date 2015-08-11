
public class ExampleFourMethod {
	ExampleFourMethod() {
		
	}
	
	public int fOf(double x) {
		if (x <= 20) {
			System.out.println(x + " <= 20, therefore ... f(" + x + ") = - 100");
			return -100;
		}
		else {
			System.out.println(x + " > 20, therefore ... f(" + x + "*2) - 4 = f("+(x*2) + ") -4");
			return fOf(x*2) - 4;
		}
	}

}
