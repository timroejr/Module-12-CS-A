
public class ExampleThreeMethod {

	ExampleThreeMethod() {
		
	}
	
	public int fOf(double x) {
		if (x <= 25) {
			System.out.println(x + " <= 25, therefore ... f(" + x  + ") = 20");
			return 20;
		} else {
			System.out.println(x + " > 25, therefore ... f(" + x + "/12 + 5) - 3 = f("+(x/12+5) + ") - 3");
			return fOf(x/12+5) - 3;
		}
	}

}
