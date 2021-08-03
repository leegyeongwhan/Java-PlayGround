
import java.util.Scanner;

class Main {
	public String solution(String result) {
		String answer = "YES";		
		int len = result.length();
		result = result.toUpperCase();
		for(int i=0; i<len/2; i++) { //result.length==2
			if(result.charAt(i) != result.charAt(len-i-1))
				{return "NO";}			
		}
		return answer;
	}

	public static void main(String[] args) {
		Main m = new Main();
		Scanner scanner = new Scanner(System.in);
		String ju = scanner.nextLine();
		System.out.println(m.solution(ju)); //goog
	}
}
