// Class Author: Soul Yoon
// Date created: 11/3/2026
// General description: this program is supposed to test the various application of for, while, and do while loops

public class pattern {


 // Here are the 5 methods that will be declared and initialized

//precondition: rows must be an integer and is non zero
//poscondition: shows a pattern depicting a staircase of stars with the top row printing 1 star,
//the following rows printing 2 more stars than the row above it 
public static void stars(int rows) {
 int currentRow = 1;

     while (currentRow <= rows) {
    
     int numOfStars = 1;
     int totalStarsForRow = currentRow * 2 - 1;
    
     while (numOfStars <= totalStarsForRow) {
        
         System.out.print("*");
         numOfStars++;
     }
     currentRow++;
     System.out.println("");
 }
     System.out.println("");
}

//precondition: rows must be an integer and is non zero
//poscondition: shows a pattern depicting a staircase of numbers with the top row printing 1, 
//the following rows printing 1 more than the previous row above it 
public static void triangle(int rows) {
 int currentRow = 1;
 while (currentRow <= rows) {
     int numAmount = 1;
    
 while(numAmount < currentRow + 1) {
    
     System.out.print(currentRow);
     numAmount++;
    
     }
 System.out.println("");
 currentRow++;
 }
 System.out.println("");
}

//precondition: start must be an integer, is non zero, and odd
//poscondition: shows a pattern depicting a reverse staircase of numbers with the top row being 
//the argument the user inputted, the following rows being printing a number 2 less than the previous row above it 
public static void odds (int start) {




     for (;start > 1 || start > 0;) {
         int currentRow = 1;


              for(;currentRow <= start;) {
         System.out.print(start);
         currentRow++;


     }
     System.out.println("");
     start -= 2;


     }
     System.out.println("");
}
    
//precondition: maxE must be an integer 
//poscondition: shows a pattern depicting a wave like pattern alternating between letters E and O, 
//E will be at the middle of the pattern and will be the longest
public static void eo(int maxE) {
String currentLetter = "E";

     if (maxE % 2 != 0) {
    	 
    	 currentLetter = "O";
     }
    	 for (int i = 0; i < maxE; i++) {
    		 int amountOfLetterForCurrentRow = i + 1;
    		 int currentRow = 1;

    		 if (currentLetter.equals("E")) {
    			 
    			 currentLetter = "O";
    			 
    		 }
    		 else if (currentLetter.equals("O")) {
    			 currentLetter = "E";
    		 }
    		 
    		 for (;currentRow <= amountOfLetterForCurrentRow;) {
    			 
                 System.out.print(currentLetter);
                 currentRow++;
    	}
             System.out.println("");
    	}
    	 
    	 for (int i = 0; maxE > i; maxE--) {
    		 int amountOfLetterForCurrentRow = maxE - 1;
    		 int currentRow = 1;

    		 if (currentLetter.equals("E")) {
    			 
    			 currentLetter = "O";
    			 
    		 }
    		 else if (currentLetter.equals("O")) {
    			 currentLetter = "E";
    		 }
    		 
    		 for (;currentRow <= amountOfLetterForCurrentRow;) {
    			 
                 System.out.print(currentLetter);
                 currentRow++;
    	}
             System.out.println("");
    	}
    
}

//precondition: rows must be an integer 
//poscondition: shows a pattern depicting a upside down pyramid with the top row printing 1,
//the following rows printing a number that is one more than the number in the row above it and
//prints the number 2 more times than the amount of times the number was printed in the row above it
 public static void pyramid(int rows) {
    int currentRow = 1;
	int amountOnAboveRow = 0;
	int m = 1;

	for (int i = 1; i <= rows; i++) {

		amountOnAboveRow += 2;
	}
	amountOnAboveRow -= 1;

	for (int j = 1; j <= rows; j++) {

    for (int k = 1; k <= amountOnAboveRow; k++) {
		System.out.print(currentRow);
		
	}
		System.out.println("");
		currentRow++;
		amountOnAboveRow -= 2;

		for (int l = 1; l <= m; l++) {

			System.out.print(" ");
		}
		m++;
	}

   
 }

 // Main method
 //precondition: methods are called with appropriate arguments 
 //poscondition: displays the following functions
 public static void main(String[] args) {
    
     stars(7);
     triangle(9);
     odds(9);
     eo(4);
	 pyramid(5);
 }
}









