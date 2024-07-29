import java.util.Scanner;
class NumberGame 
{
static void NumberGame(){
	int start = 1;
	int end = 100;
	int diff = end - start + 1;
	int chanceCount = 10;
        int Round=0;
        while(true) {
		double random = Math.floor(Math.random() *(diff))+start;
		Scanner sc = new Scanner(System.in);
	   
		for(int i = 0;i<=chanceCount;i++) {
			System.out.println("Enter a random number.This is Round " + Round);
			String input = sc.nextLine();

			if(input.equalsIgnoreCase("quit")) {
			     System.out.println("you have quit the game.");
			     System.out.println("Your score is " + Round);
			     return;
			}
	
			int guess;
			try {
			     guess = Integer.parseInt(input);
			} 
	  	        catch (Exception e) {
		             System.out.println("Please enter a valid number or type 'quit' to exit.");
			     continue;
			}
			if(guess==random) {
          		     System.out.println("Congrats!you won the game.Play next round");
			     System.out.println("You have taken " + (i+1) + " attempts.");
			     Round++;  
	     	             break;
			}
			else if(guess>random) {
	 		     System.out.println("HINT: Your guess is too large");
			}
			else {
         	             System.out.println("HINT: Your guess it too small");
			}
			if(i == chanceCount - 1) {
            		     System.out.println("You've used all your 10 attempts. The correct number was " + random + ".");
			     System.out.println("Your score is " + Round);
      			     System.out.println("Type 'play' to start a new game or 'quit' to exit.");
			     input = sc.nextLine();
                                 if (input.equalsIgnoreCase("play")) {
                       			 break; 
        		         } 
				 else if (input.equalsIgnoreCase("quit")) {
	                        	System.out.println("You have quit the game.");
                       		        System.out.println("Your score is " + Round);
                        		return;
                                }	
       		        }

	       }	
  }
}
		
public static void main(String[] args) {
        NumberGame();
    }
}
