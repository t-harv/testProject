package code.war;

import java.util.ArrayList;
import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
    	int results = 0;
    	int counter = binary.size() - 1;
//    	System.out.println("Binary size = " + binary.size());
//    	System.out.println("Counter = " + counter);
    	for(int i = 0;i < binary.size() ; i++){
//    		System.out.println("Position = " + i + " Element = " + binary.get(i));
    		if(binary.get(i) == 1){
//    			System.out.println(i);
    			results = (int) (results + Math.pow(2, counter));
    		}
    		counter--;
    	}
    	return results;
    }
    
    public static void main(String[] args){
    	List<Integer> machineLanguage = new ArrayList<Integer>();
    	machineLanguage.add(1);
    	machineLanguage.add(0);
    	machineLanguage.add(1);
    	machineLanguage.add(1);
    	
    	System.out.println(ConvertBinaryArrayToInt(machineLanguage));
    }
    
    
}
