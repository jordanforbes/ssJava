/**
 * 
 */
package guessinggame;

import java.util.Random;
import java.util.Scanner;

/**
 * GUESS A NUMBER!
 * BETWEEN 1-100
 * IF THE GUESS IS WITHIN 10, EXIT AND GIVE ANSWER
 * IF NOT, USER GETS 5 TOTAL CHANCES TO GET IT RIGHT
 * 
 * @author Jordf
 *
 */
public class Guess {

	/**
	 * @param args
	 */
	
	//when chances hit 0 game ends
	public static int chances = 5;
	
	//the answer the player is guessing
	static Random rand = new Random();
	public static int ans = rand.nextInt(100)+1;
	
	
	public static void main(String[] args) {
		while(chances>0) {
			gameLoop(ans);			
		}
	}
	
	//plays the game
	public static void gameLoop(int ans) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int playerGuess = scan.nextInt();
		
		System.out.println("you chose "+playerGuess);
		
		if(playerGuess< ans-10 || playerGuess > ans+10) { //if player is wrong
			if(chances>1) { //if player still has chances
				chances -=1;
				System.out.println("chances: "+chances);
				
			}else { //if player has lost
				System.out.println("Sorry, the number you wanted was "+ans);
				chances=0;
				
			}
		}else { //if player has won
			System.out.println("You did it!");
			System.out.println("the answer was "+ans);
			chances = 0;
		}
		
	}

}
