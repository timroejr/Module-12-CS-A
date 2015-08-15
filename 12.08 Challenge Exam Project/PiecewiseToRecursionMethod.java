/**
 * 
 * @author timothyroejr
 * @version V1
 */
class piecewiseExample {
piecewiseExample() {
		
	}
	
	public int fOf(double x) {
		if (x <= 25) {
			System.out.println(x + " <= 25, therefore ... f(" + x + ") = 20");
			return 20;
		}
		else {
			System.out.println(x + " > 25, therefore ... f(" + x + "/12+5) - 3 = f("+ (x/12+5) + ") - 3");
			return fOf(x/12+5) - 3;
		}
	}

}
public class PiecewiseToRecursionMethod {
	public static void main(String[] args) {
		int x;
		piecewiseExample example = new piecewiseExample();
		x = 30;
		System.out.println("f(" + x + ") = " + example.fOf(x));
		System.out.println();
	}
}
