
public class Professor {

	//variables 
	public String name = "Mr. Weakland"; 
	public int likeableScale; 
	private String office; 
	
	//Constructor
	//load default or initial values 
	public Professor() { 
		likeableScale = 5; 
		office = "Lynch 103"; 
	}
	
	public void displayInfo() {
		System.out.println("\n\nCurrent Professor Name: " + name); 
		System.out.println("\n\nCurrent Rating Level: " + likeableScale); 
		System.out.println("\n\nOffice Location: " + office); 
	}
	public void like() {
		if (likeableScale==10) {
			System.out.println("\n\nHold on! You can't like your professor any more!\n\n"); 
		} else {
		likeableScale++; 
		}}
		public void dislike() {
			if (likeableScale==0) {
				System.out.println("\n\nHold on! You can't dislike your professor any more!\n\n"); 
			} else {
			likeableScale--; 
			}} 
		public void throwProfessor(int number) {
			if (likeableScale > number) {
				System.out.println("\n\n You like your professor too much. Why would you throw him/her? \n\n");
			} else {
				System.out.println("\n\nYou have sucessfully thrown your professor. Feel better now?\n\n");
				likeableScale = 5; 
			}
		}
	
	
	
}
