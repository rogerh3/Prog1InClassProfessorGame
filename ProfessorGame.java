import java.util.Scanner;
import java.util.Random; 

public class ProfessorGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initialize scanner and random number
		Scanner keyboard = new Scanner (System.in);
		Random randomNumber = new Random();
		
		//Create instance of the class Professor
		Professor profOne = new Professor();
		
		/*inheritance class example 
		Inheritance_Subclass_CSprofessor compProf = new Inheritance_Subclass_CSProfessor(); 
		
		compProf.NumberOfTabsOpen = 15; */
		
		int randomToss = 0;
		int menuChoice = 0; 
		
		do 
		{
			System.out.println("Throw Your Professor!");
			System.out.println("---------------------");
			System.out.println("1.) Display Professor Information");
			System.out.println("2.) Like Your Professor");
			System.out.println("3.) Dislike Your Professor");
			System.out.println("4.) Throw Your Professor"); 
			System.out.println("5.) Exit"); 
			System.out.println("What would you like to do?"); 
			menuChoice = keyboard.nextInt(); 
			
			switch(menuChoice)
			{
			case 1:
				profOne.displayInfo(); 
				break;
			case 2:
				profOne.like(); 
				break;
			case 3: 
				profOne.dislike(); 
				break;
			case 4:
				// 11 for 11 values, 0-10
				randomToss = randomNumber.nextInt(11); 
				profOne.throwProfessor(randomToss);
				break;
			case 5:
				System.out.println("Thank you for playing. Your professor is going to lay down and rest.");
				break; 
			default:
				System.out.println("Please enter a valid choice."); 
			}
			
		} while (menuChoice != 5); 
	}

}
