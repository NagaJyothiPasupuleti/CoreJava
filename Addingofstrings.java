package stringprograms;
import java.util.Scanner;

public class Addingofstrings {

	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);
		System.out.println("Enter the string s1 ");
		String s1 = name.next();// TODO Auto-generated method stub
		System.out.println("the string s1 is "+s1);
		System.out.println("Enter the string s2 ");
		String s2 = name.next();
		System.out.println("the string s2 is "+s2);
		System.out.println("addiyion of strings is "+(s1+" "+s2));
	}

}
