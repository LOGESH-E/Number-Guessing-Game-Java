package numGuessingGame;
import java.util.Scanner;
import java.util.Random;
public class NumGuess 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int userOption;
		
		Random ran = new Random();
		
		
		
		System.out.println("======================================================");
		System.out.println();
		System.out.println("🎮✨ WELCOME TO THE NUMBER GUESSING GAME ✨🎮");
		System.out.println();
		System.out.println("📜 RULES:");
		System.out.println("🔢 Guess a number between 👉 0 to 99");
		System.out.println("🎯 You have 💯 10 chances only");
		System.out.println("⭐ Score starts at 💯 (−10 each wrong guess)");
		System.out.println("📈 Hint: I’ll say ⬆️ Higher or ⬇️ Lower");
		System.out.println("🏆 Win if you guess before chances run out!");
		System.out.println();
		System.out.println("======================================================");
		System.out.println();
		
		System.out.println();
		do
		{
			System.out.println("▶️ Enter  '1️'  to START or  '0️' to 🚪 QUIT");
			System.out.println();
			userOption = scan.nextInt();
			System.out.println();
			if(userOption!=0 && userOption!=1)
			{
				System.out.println("❌ Invalid input. Please enter  '1'  or  '0'  only.");
				userOption = scan.nextInt();
				System.out.println();
			}
			
		}while(userOption!=1 && userOption!=0);
		
		
		while(userOption==1)
		{
			int flag =0;
			int val = ran.nextInt(100);
			int score=10;
			int chance = 10;
			int chances=9;
			System.out.println("🤔 Guess the Number between 🔢 0 to 99");
			System.out.println();
			while(chance>0)
			{
			
				int userGuess = scan.nextInt();
				System.out.println();
				if(userGuess==val)
				{
					chance=0;
					flag=1;
					System.out.println("🎉🏆 YOU WON THE GAME! 🏆🎉");
					System.out.println("⭐ Your Score : " + (score * 10) + " / 100 ⭐");
					System.out.println();
				}
				if(userGuess>val && chance>1)
				{
					System.out.println(" Try a smaller ⬇️ number!");
					System.out.println("⏳ Chances left: " + chances);
					System.out.println();
					
				}
				else if(userGuess<val && chance>1)
				{
					System.out.println(" Try a larger ⬆️ number!");
					System.out.println("⏳ Chances left: " + chances);
					System.out.println();
					
				}
				
				chance--;
				score--;
				chances--;
				
				if(score==0 && flag==0)
				{
					System.out.println("💀 GAME OVER! You lost all your chances.");
					System.out.println("🔑 The correct number was: " + val);
					System.out.println();
					System.out.println();
				}
			}
			do 
			{
				System.out.println("🔁 Enter  '1'  to PLAY AGAIN or  '0️' to 🚪 EXIT");
				System.out.println();
				System.out.println();
				userOption = scan.nextInt();
				System.out.println();
				if(userOption!=0 && userOption!=1)
				{
					System.out.println("❌ Invalid input! Please enter only  '1' or  '0'.");
					System.out.println();
					userOption = scan.nextInt();
					System.out.println();
				}
			}while(userOption!=0 && userOption!=1);
		}
			
		scan.close();
		
	}
	
}
