import java.util.Scanner;

public class MovieDriver_Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		Movie m1 = new Movie();
		boolean again= true;
		while(again) {
			System.out.print("Enter the movie title:");
			String title= input.nextLine();
			m1.setTitle(title);
			System.out.print("Enter movie rating: ");
			String rating= input.nextLine();
			m1.setRating(rating);
			System.out.print("Enter number of ticket sold at theater: ");
			int tickets= input.nextInt();
			m1.setSoldTickets(tickets);
			input.nextLine();
			System.out.print("Would you like to go again? (y/n) ");
			String answer=input.nextLine();
			if(answer.compareToIgnoreCase("n")==0) {
				again=false;
			}
				
		}
		
		
		
	}

}
