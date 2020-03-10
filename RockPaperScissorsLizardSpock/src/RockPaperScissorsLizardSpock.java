/**
 * ********************************************
 * @author Aidan Mann
 * Date: 02/29/20
 * Version: 1.0
 * Code Description: Play Rock, Paper, Scissors
 * ********************************************
 */

import java.util.*;

public class RockPaperScissorsLizardSpock {
	
	private static Scanner input;
	private static Random generator;
	
	public static void main(String[] args) {
		
		String personPlay = null;																				// User's play -- "Rock", "Paper", "Scissors"
		String computerPlay = null;																				// Computer's play -- "Rock", "Paper", "Scissors"
		String readyToPlay;																						// prompts user if they are ready to play
		String replay;																							// prompts user if they want to play again
		int computerInt;																						// Random number determines computerPlay
		boolean win = false;
		boolean start = false;
		
		input = new Scanner(System.in);																			// assigns Scanner to 'input'
		generator = new Random();																				// assigns Random to 'generator'
		
		System.out.println("Welcome to 'Rock, Paper, Scissors'.");												// prompts user if they would like to play
		System.out.println("\"R\" = Rock\n\"P\" = Paper\n\"S\" = Scissors\n\"L\" = Lizard\n\"SP\" = Spock");
		System.out.println("Would you like to play? \n YES / NO");
		readyToPlay = input.nextLine();
		
		if(readyToPlay.equals("YES")) {																			// determines if user wants to play (if not, program ends)
			start = true;
		} else {
			System.out.println("Have a nice day!");
		}
			
		if(start == true) {
			
			while(win == false) {																				// loops game until a winner is found
				System.out.println("R, P, S, L, or SP?");														// get player's play	
				personPlay = input.nextLine();
				
				computerInt = generator.nextInt(5); 															// generates computer's play (O, 1, 2, 3, 4)
				
				switch(computerInt) {																			// converts computerInt to computer's play
				case 0:
					if(computerInt == 0) {																		// computerInt '0' = 'Rock'
						computerPlay = "R";
					}
					break;
				case 1: 
					if(computerInt == 1) {																		// computerInt '1' = 'Paper'
						computerPlay = "P";
					}
					break;
				case 2: 
					if(computerInt == 2) {																		// computerInt '2' = 'Scissors'
						computerPlay = "S";
					}
					break;
				case 3: 
					if(computerInt == 3) {																		// computerInt '3' = 'Lizard'
						computerPlay = "L";
					}
					break;
				case 4:
					if(computerInt == 4) {																		// computerInt '4' = 'Spock'
						computerPlay = "SP";
					}
					break;
				}
				
				if(personPlay.equals(computerPlay)) {															// determines the winner
					
					System.out.println("You chose: " + personPlay);
					System.out.println("The computer chose: " + computerPlay);
					System.out.println("Its a tie!");
					
				} else if(personPlay.equals("R")) {																// tests conditions for personPlay 'R'
					
					if(computerPlay.equals("S")) {
						
						System.out.println("Rock crushes Scissors. You win!");
						win = true;
						System.out.println("Would you like to play again?\nYES / NO");							// asks if user would like to play again
						replay = input.nextLine();
						if(replay.equals("NO")) {																// if user declines, game ends
							
							start = false;
							win = true;
							System.out.println("Thank you for playing!");										// thanks user for playing
						} else {																				// if user accepts, game restarts
							win = false;
						}
					} else if(computerPlay.equals("L")) {
						
						System.out.println("Rock crushes Lizard. You win!");
						win = true;
						System.out.println("Would you like to play again?\nYES / NO");		
						replay = input.nextLine();
						if(replay.equals("NO")) {											
							
							start = false;
							win = true;
							System.out.println("Thank you for playing!");					
						} else {															
							win = false;
						}
					} else if(computerPlay.equals("SP")) { 
						
						System.out.println("Spock vaporizes Rock. You lose!");
						System.out.println("Would you like to play again?\nYES / NO");		
						replay = input.nextLine();
						if(replay.equals("NO")) {											
							
							start = false;
							win = true;
							System.out.println("Thank you for playing!");					
						} else {															
							win = false;
						}
					} else if(computerPlay.equals("P")) {
						
						System.out.println("Paper beats rock. You lose!");
						System.out.println("Would you like to play again?\nYES / NO");
						replay = input.nextLine();
						if(replay.equals("NO")) {
							
							start = false;
							win = true;
							System.out.println("Thank you for playing!");
						} else {
							win = false;
						}
					}
				} else if(personPlay.equals("P")) {											// tests conditions for personPlay 'P'
					
					if(computerPlay.equals("R")) {
						
						System.out.println("Paper beats rock. You win!");
						win = true;
						System.out.println("Would you like to play again?\nYES / NO");
						replay = input.nextLine();
						if(replay.equals("NO")) {
							
							start = false;
							win = true;
							System.out.println("Thank you for playing!");
						} else {
							win = false;
						}
					} else if(computerPlay.equals("SP")) {
						
						System.out.println("Paper disproves Spock. You win!");
						win = true;
						System.out.println("Would you like to play again?\nYES / NO");		
						replay = input.nextLine();
						if(replay.equals("NO")) {											
							
							start = false;
							win = true;
							System.out.println("Thank you for playing!");					
						} else {															
							win = false;
						}
					} else if(computerPlay.equals("L")) {
						
						System.out.println("Lizard eats Paper. You lose!");
						System.out.println("Would you like to play again?\nYES / NO");		
						replay = input.nextLine();
						if(replay.equals("NO")) {											
							
							start = false;
							win = true;
							System.out.println("Thank you for playing!");					
						} else {															
							win = false;
						}
					} else if(computerPlay.equals("S")) {
						
						System.out.println("Scissors beat paper. You lose!");
						System.out.println("Would you like to play again?\nYES / NO");
						replay = input.nextLine();
						if(replay.equals("NO")) {
							
							start = false;
							win = true;
							System.out.println("Thank you for playing!");
						} else {
							win = false;
						}
					}
				} else if(personPlay.equals("S")) {											// tests conditions for personPlay 'S'
					
					if(computerPlay.equals("P")) {
						System.out.println("Scissors beats paper. You win!");
						win = true;
						System.out.println("Would you like to play again?\nYES / NO");
						replay = input.nextLine();
						if(replay.equals("NO")) {
							
							start = false;
							win = true;
							System.out.println("Thank you for playing!");
						} else {
							win = false;
						}
					} else if(computerPlay.equals("L")) {
						
						System.out.println("Scissors decapitate Lizard. You win!");
						win = true;
						System.out.println("Would you like to play again?\nYES / NO");		
						replay = input.nextLine();
						if(replay.equals("NO")) {											
							
							start = false;
							win = true;
							System.out.println("Thank you for playing!");					
						} else {															
							win = false;
						}
					} else if(computerPlay.equals("SP")) {
						
						System.out.println("Spock smashes Scissors. You lose!");
						System.out.println("Would you like to play again?\nYES / NO");		
						replay = input.nextLine();
						if(replay.equals("NO")) {											
							
							start = false;
							win = true;
							System.out.println("Thank you for playing!");					
						} else {															
							win = false;
						}
					} else if(computerPlay.equals("R")) {
						
						System.out.println("Rock beats scissors. You lose!");
						System.out.println("Would you like to play again?\nYES / NO");
						replay = input.nextLine();
						if(replay.equals("NO")) {
							
							start = false;
							win = true;
							System.out.println("Thank you for playing!");
						} else {
							win = false;
						}
					}
				} else if(personPlay.equals("L")) {											// tests conditions for personPlay 'L'
					
					if(computerPlay.equals("P")) {
						System.out.println("Lizard eats Paper. You win!");
						win = true;
						System.out.println("Would you like to play again?\nYES / NO");
						replay = input.nextLine();
						if(replay.equals("NO")) {
							
							start = false;
							win = true;
							System.out.println("Thank you for playing!");
						} else {
							win = false;
						}
					} else if(computerPlay.equals("SP")) {
						
						System.out.println("Lizard poisons Spock. You win!");
						win = true;
						System.out.println("Would you like to play again?\nYES / NO");		
						replay = input.nextLine();
						if(replay.equals("NO")) {											
							
							start = false;
							win = true;
							System.out.println("Thank you for playing!");					
						} else {															
							win = false;
						}
					} else if(computerPlay.equals("R")) {
						
						System.out.println("Rock smashes Lizard. You lose!");
						System.out.println("Would you like to play again?\nYES / NO");		
						replay = input.nextLine();
						if(replay.equals("NO")) {											
							
							start = false;
							win = true;
							System.out.println("Thank you for playing!");					
						} else {															
							win = false;
						}
					} else if(computerPlay.equals("S")) {
						
						System.out.println("Scissors decapitate Lizard. You lose!");
						System.out.println("Would you like to play again?\nYES / NO");
						replay = input.nextLine();
						if(replay.equals("NO")) {
							
							start = false;
							win = true;
							System.out.println("Thank you for playing!");
						} else {
							win = false;
						}
					}
				} else if(personPlay.equals("SP")) {											// tests conditions for personPlay 'SP'
					
					if(computerPlay.equals("R")) {
						System.out.println("Spock vaporizes Rock. You win!");
						win = true;
						System.out.println("Would you like to play again?\nYES / NO");
						replay = input.nextLine();
						if(replay.equals("NO")) {
							
							start = false;
							win = true;
							System.out.println("Thank you for playing!");
						} else {
							win = false;
						}
					} else if(computerPlay.equals("S")) {
						
						System.out.println("Spock smashes Scissors. You win!");
						win = true;
						System.out.println("Would you like to play again?\nYES / NO");		
						replay = input.nextLine();
						if(replay.equals("NO")) {											
							
							start = false;
							win = true;
							System.out.println("Thank you for playing!");					
						} else {															
							win = false;
						}
					} else if(computerPlay.equals("P")) {
						
						System.out.println("Paper disproves Spock. You lose!");
						System.out.println("Would you like to play again?\nYES / NO");		
						replay = input.nextLine();
						if(replay.equals("NO")) {											
							
							start = false;
							win = true;
							System.out.println("Thank you for playing!");					
						} else {															
							win = false;
						}
					} else if(computerPlay.equals("L")) {
						
						System.out.println("Lizard poisons Spock. You lose!");
						System.out.println("Would you like to play again?\nYES / NO");
						replay = input.nextLine();
						if(replay.equals("NO")) {
							
							start = false;
							win = true;
							System.out.println("Thank you for playing!");
						} else {
							win = false;
						}
					}
				}  
			}
		}
	}

} 

