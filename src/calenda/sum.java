package calenda;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		for(int i=0; i<2; i++) { // weekday ==su ==0
			System.out.printf("  ");
	}
	for (int i = 1; i <= 31; i++) {
		System.out.printf("%3d", i);
		if (i % 7 == 0) {
			System.out.println();
		}
	
	}

}
}
