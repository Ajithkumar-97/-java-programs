package java;

public class interviewquestions {

	
		public static void main(String[] args) {
		String given="ajithkumar";
			
			System.out.println(given.length());
			
			char[] CharArray =given.toCharArray();
			
		int length=0;
		for(char c:CharArray){
		    length++;
		}
		    System.out.println(length);
		}
	}
