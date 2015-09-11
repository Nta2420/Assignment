import java.util.Scanner;
public class Classassignment {
	public static void main(String [] args) {
		String Username, Password;
		Scanner scan  = new Scanner(System.in);
		System.out.println("Enter Username ");
		Username = scan.nextLine();
		System.out.println("Enter Password ");
		Password = scan.nextLine();
		System.out.print("Hello " + Username);
		System.out.print(", Welcome to CSC200 class! and Your password is " + Password);
	}
}
