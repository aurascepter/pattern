// Soul Yoon
// This is a collection of methods that create various patterns using loops
//primarily this to practice the use of loops for the AP exam.
public class pattern {

	// Here are the 5 methods that will be declared and initialized 
	
	
//*
//**
//***
//****
//*****
			
	
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
		
		
		
	
public static void eo(int maxE) {
    int currentRow = 0;
    int amountOfLetterForCurrentRow = currentRow + 1;
 
        String currentLetter = "E";

		for (;currentRow < amountOfLetterForCurrentRow;) {

            System.out.print(currentLetter);
            currentRow++;
    }
        System.out.println("");
        currentLetter = "O";

}
	
	public static void pyramid(int rows) {
		
		
		
		
		
		
		
		
	}
	
	// Main method 
	public static void main(String[] args) {
		
		stars(7);
		triangle(9);
		odds(9);
        eo(5);
	}
}

