//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		
		//add in a do while loop after you get the basics up and running
		
			String player = "";
		
			out.print("Type in your prompt [R,P,S] :: ");
			
			response = keyboard.next().charAt(0);
		
			RockPaperScissors game = new RockPaperScissors();	
			game.setPlayers(response);
			System.out.println(game);
			
			do
			{
				out.print("Type in your prompt [R,P,S] :: ");
				response = keyboard.next().charAt(0);
				game.setPlayers(response);
				System.out.println(game);

			}
			while (response != 'X');
	}
}



