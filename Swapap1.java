package basicprograms;
import java.util.Scanner;

public class Swapap1 {
 
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("enter k value");
		int k = n.nextInt();
		System.out.println("k value is= "+k);
		System.out.println("enter m value");
		int m= n.nextInt();
		System.out.println("enter m value= "+m);
		int j=k;
		k=m;
		m=j;
		System.out.println("k= "+k);
		System.out.println("m= "+m);
		// TODO Auto-generated method stub

	}

}
