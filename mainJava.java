package mainpac;
import java.util.Scanner;

import mainpac.Rectangle_Calculator;
import mainpac.Cube;
public class mainJava {
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String argsp[]) {
//		float pat_width = 150;
//		float pat_length = 200;
//		Rectangle_Calculator pats_scField = new Rectangle_Calculator(pat_width, pat_length);
		System.out.println("Enter side ");
		float side = scanner.nextFloat();
		Cube rubic = new Cube(side);
		rubic.print_report();
	}
}