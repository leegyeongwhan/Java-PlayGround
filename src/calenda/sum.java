package calenda;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째수");
		int first =  scanner.nextInt();
		System.out.println("두번째수");
		int second =  scanner.nextInt();
		
		System.out.println("합은"+ (first+second));
		scanner.close();
	}

}
