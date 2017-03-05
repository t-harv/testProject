package code.war;

public class BrokenSequence {


	public int findMissingNumber(String sequence) {
		try{	
			
			if(sequence.length() == 0)
				return 0;
					
			String[] sequenceArray = sequence.split(" ");
			
			java.util.List<Integer> intSequence = new java.util.ArrayList<Integer>();
			
			
			for(String x: sequenceArray){
				intSequence.add(Integer.parseInt(x));
			}
			
			java.util.Collections.sort(intSequence);
			
			for(Integer i: intSequence){
				System.out.println(i);
			}
			
			
			for(int i = 1; i <= intSequence.get(intSequence.size() -1); i ++){
				if(i != intSequence.get(i - 1))
					return i;
					
			}
		}catch(NumberFormatException nfe){
			return 1;
		}

		return 0;
	}

	public static void main(String[] args){
		BrokenSequence bs = new BrokenSequence();
		String sequence = "1 3 22 55 2"; 

		System.out.println("Lowest Missing number: " + bs.findMissingNumber(sequence));
	}

}
