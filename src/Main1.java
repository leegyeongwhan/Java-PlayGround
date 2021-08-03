import java.util.*;
public class Main1 {
	
	public String Solution(String result) {  // ABCabc
		String answer="";
		
		for(char x : result.toCharArray() ) {  //문자열을 문자 배열로  
//			if(Character.isLowerCase(x)) { answer += Character.toUpperCase(x); } 			//isLowercase로 x가 소문자인지물어본다	true면 대문자로				// toUpercase isLowCacse
//			else {	answer += Character.toLowerCase(x); }  	//대문자가 들어왔다는소리
			
			if(x>=97 && x<=122) { answer += (char)(x-32) ;}  //x가소문자 >> x를대문자로
			else answer+=  (char)(x+32);
			
		}
		return answer;
	 }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-genera	ted method stub
		Main1 m = new Main1();
		Scanner kb  = new Scanner(System.in);
		String result  = kb.next();
		//System.out.println(result);
		
		System.out.println(m.Solution(result));  //Abc
		
	}

}
