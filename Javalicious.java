import java.util.Scanner;

/**
 * Fun little class that asks for a person's name, age, and desired nickname. Then gives the length of the userName and returns a new string that is half of their real name.
 * @author Max
 * @version 04/27/18
 */
public class Javalicious
{
    private static String name;
    private static String age;
    private static String usrName;
    private static int usrLength;
    private static String halfName = "";

    /**
     * Main driver for the Javalicious program.
     * @param args Command line arguments
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); //Scanner for input

        System.out.println("Enter your name: ");
        name = sc.nextLine(); //Reads in their name;

        System.out.println();
        System.out.println("Your name is: " + name + " \nGood. Now enter your age: ");
        age = sc.nextLine(); //Reads in age

        System.out.println();
        System.out
                .println("Your age is: " + age + " \nAwesome. Now give me a nickname you like.");
        usrName = sc.nextLine(); //Reads in their username (nickname)

        System.out.println();
        System.out.println(
                "Your username is: " + usrName + " \nSweet. That's a cool nickname.");
        setUsrLength(usrName); //Sets the length of the username

        System.out.println();
        System.out.println("NOW FOR SOME FUN STUFF");

        System.out.println();
        System.out.println("Your username is: " + getUsrLength() + " characters long.");

        System.out.println();
        halfName(name);
        System.out.println("Half of your real name is: " + halfName);

    }

    /**
     * Sets the length of the entered userName
     * @param usrName Nickname of the user
     */
    public static void setUsrLength(String usrName)
    {
        usrLength = usrName.length();
    }

    /**
     * Divides the user's real name in half and returns the first half. If the user's name has no characters no changes are made.
     * @param name The user's name
     */
    public static void halfName(String name)
    {
        int length = name.length();
        if (length > 0)
        {
            for (int i = 0; i < length / 2; i++)
            {
                halfName += name.charAt(i);
            }
            return;
        }
        halfName = name;
    }
    
    /**
     * Gets the length of the user's userName
     * @return The length of the user's userName
     */
    public static int getUsrLength() {
        return usrLength;
    }

}
