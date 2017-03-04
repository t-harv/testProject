package code.war;

public class Reverse {

	public String reverse(String str) {
		if(str.length() == 1)
			return str;
		else
			return str = reverse(str.substring(1, str.length())) + str.charAt(0);
	}

	public static void main(String [] args){

		Reverse obj = new Reverse();
		String word = "happy";

		System.out.println(obj.reverse(word));
	}

}
