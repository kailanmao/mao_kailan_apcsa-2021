//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private char playChoice;
	private char compChoice;

	public RockPaperScissors()
	{
		setPlayers('x');
	}

	public RockPaperScissors(char player)
	{
		setPlayers(player);
	}

	public void setPlayers(char player)
	{
		playChoice = player;
		
		int num = (int)(Math.random() * 3);
		if (num == 0) compChoice = 'R';
		if (num == 1) compChoice = 'P';
		if (num == 2) compChoice = 'S';
	}

	public String determineWinner()
	{
		String winner="";
		if (playChoice == compChoice) winner = "It's a tie!";
		else if ((playChoice == 'R' && compChoice == 'S')
			||(playChoice == 'S' && compChoice == 'P')
			||(playChoice == 'P' && compChoice == 'R'))
		{
		winner = "Player wins!";
		}
		else
		{
			winner = "Computer wins!";
		}
		
		return winner;
	}

	public String toString()
	{
		return "Player had " + playChoice + "\nComputer had " + compChoice + "\n" + determineWinner() + "\n";

	}
}