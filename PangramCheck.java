package assignment1;

import java.util.HashSet;

public class PangramCheck {
	 public static void main(String[] args) {
	        String input = "Brown jars prevented the mixture from freezing too quickly";
	        
	        boolean isPangram = checkIfPangram(input);
	        
	        if (isPangram) {
	            System.out.println("The input is a pangram.");
	        } else {
	            System.out.println("The input is not a pangram.");
	        }
	    }


	    public static boolean checkIfPangram(String input) {
	        input = input.toLowerCase(); 
	        HashSet<Character> alphabetSet = new HashSet<>();

	        for (char c : input.toCharArray()) {
	            if (Character.isLetter(c)) {
	                alphabetSet.add(c);
	            }
	        }
	        return alphabetSet.size() == 26;
	    }
}


