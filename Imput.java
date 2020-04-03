package baisics;

import java.util.Scanner;

public class Imput {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		
		System.out.println("Enter your name: ");
		String name = in.next();
		System.out.print("Enter your age: ");
		int age = in.nextInt();
		
		
		System.out.println("Hello "+ name+"You are "+ age + "years old");
		 in.close();
		 

	}

}
