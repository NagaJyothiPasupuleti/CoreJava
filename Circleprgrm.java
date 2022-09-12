package areandperimeter;
import java.util.Scanner;

public class Circleprgrm {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the radius");
		float radius=s.nextFloat();
		System.out.println("the radius= "+radius);
		System.out.println("radius of the circle is "+(Math.PI*radius*radius));
		System.out.println("perimeter of the square "+(2*Math.PI*radius*radius));
		// TODO Auto-generated method stub

	}

}
