import java.util.Scanner;

public class MovieDriver_Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		Movie m1 = new Movie();
		System.out.print("Enter the movie title:");
		String title= input.nextLine();
		m1.setTitle(title);
		System.out.print("Enter movie rating: ");
		String rating= input.nextLine();
		m1.setRating(rating);
		System.out.print("Enter number of ticket sold at theater: ");
		int tickets= input.nextInt();
		m1.setSoldTickets(tickets);
		System.out.print(m1.toString());
		
			
		
		
		
	}

}
