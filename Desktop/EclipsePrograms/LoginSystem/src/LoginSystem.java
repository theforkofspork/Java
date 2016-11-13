import java.util.ArrayList;
import java.util.Scanner;

public class LoginSystem 
{
	ArrayList<String> namesList = new ArrayList<String>(10);
	public static void main(String[] args) 
	{
		ArrayList<String> namesList = new ArrayList<String>(10);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name");
		System.out.println("");
		String firstName = scan.nextLine();
		System.out.println("Enter your last name");
		System.out.println("");
		String lastName = scan.nextLine();
		scan.close();
		StringBuilder build = new StringBuilder();
		build.append(firstName);
		build.append(" ");
		build.append(lastName);
		String currentName = build.toString();
		if(detectIfExistingName(currentName, namesList))
		{
			System.out.println("Your name is not recognized, would you like to create an account");
		}
	}
	private static boolean detectIfExistingName(String name, ArrayList<String> namesList)
	{
		for(int i = 0; i < namesList.size(); i++)
		{
			if(name == namesList.get(i)) return true;
		}
		return false;
	}
}
