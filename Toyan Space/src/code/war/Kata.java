package code.war;

import java.util.Arrays;

public class Kata {
	
	public static char findMissingLetter(char[] array){
//		System.out.println(array[0] + 1);
//		char results = (char) (array[0] + 1);
		
//		System.out.println(results);
		Arrays.sort(array);
		
		for(int i = 0; i < array.length; i++){
			if(i != array.length){
				char results = (char) (array[i] + 1);
				if(array[i+1] != results)
					return results;
			}
		}
		
		
		return ' ';
	}
	
	public static char[] sortChars(char[] array){
		Arrays.sort(array);
		return array;
	}
	
	public static void main(String[] arg){
		char[] charlie = {'e','a', 'b', 'c'};
		
//		System.out.println("List of chars unsorted");
//		
//		for(char x : charlie){
//			System.out.println(x);
//		}
//		
//		sortChars(charlie);
//		
//		System.out.println("List of chars sorted");
//		for(char x : charlie){
//			System.out.println(x);
//		}
		
		System.out.println(findMissingLetter(charlie));
		
	}

}
