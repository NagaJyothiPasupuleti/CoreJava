package stringprograms;

import java.util.Scanner;

public class Lnulcharl {

	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);
		System.out.println("Enter the string s1 ");
		String s1 = name.next();// TODO Auto-generated method stub
		System.out.println("the string s1 is "+s1);
		System.out.println("Enter the string s2 ");
		String s2 = name.next();
		System.out.println("the string s1 is "+s1);// TODO Auto-generated method stub
		System.out.println("the length of the string s1 is "+s1.length());
		System.out.println("uppercase of string s1 is "+s1.toUpperCase());
		System.out.println("lowercase of string s1 is "+s1.toLowerCase());
		System.out.println("location of the string s1 is "+s1.indexOf("Jyo"));
		System.out.println("the string s2 is "+s2);
		System.out.println("the  length of string s2 is "+s2.length());
		System.out.println("uppercase of string s2 is "+s2.toUpperCase());
		System.out.println("lower case string s2 is "+s2.toLowerCase());
		System.out.println("location of the string s2 is "+s2.indexOf("le"));
	}

}
