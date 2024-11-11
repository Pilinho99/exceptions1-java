package exceptions_14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		method1();
		
		System.out.println("End of program");

	}
	
	public static void method1() {
		System.out.println("---Method1 Start---");
		method2();
		System.out.println("---Method1 End---");
	}
	
	public static void method2() {
		System.out.println("---Method2 Start---");
		Scanner sc = new Scanner(System.in);

		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception: Invalid postion");
			// show the raw exception
			e.printStackTrace();
		} catch (InputMismatchException e) {
			System.out.println("Exception: Not a number");
		}
		
		System.out.println("---Method2 End---");

		sc.close();
	}

}
