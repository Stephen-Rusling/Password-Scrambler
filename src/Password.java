// *********************************************************************************************************
// Password.java
//
// An application that prompts for and obtains a person’s first and last name (separately), then composes
// and displays a new password for a computer account. The password is a string composed of the first
// character of the person’s first name, followed by two random digits in the range 0 to 9, followed by the
// first letter of the person’s last name, followed by three more random digits in the range 0 to 9
// *********************************************************************************************************
import java.util.Random;
import java.util.Scanner;

public class Password
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random rando = new Random();

        // Prompts user for first and second names seperately
        System.out.print("Please enter your first name: ");
        String first = scan.nextLine();
        System.out.print("Please enter your second name: ");
        String second = scan.nextLine();

        // Produces 'random' values for printout, bound based on specifications
        int randomOne = rando.nextInt(99);
        int randomTwo = rando.nextInt(999);

        // Puts together 'password' and displays on final line of output
        System.out.print("New password: " + first.charAt(0));
        System.out.print(randomOne);
        System.out.print(second.charAt(0));
        System.out.print(randomTwo);
    }
}