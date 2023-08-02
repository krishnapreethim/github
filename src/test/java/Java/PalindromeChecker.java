package Java;
import java.util.Scanner;
public class PalindromeChecker
{
	
	    public static boolean isPalindrome(int number) {
	        // Convert the number to a string for comparison
	        String numberStr = String.valueOf(number);

	        // Reverse the string and compare with the original
	        String reversedStr = new StringBuilder(numberStr).reverse().toString();

	        return numberStr.equals(reversedStr);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = scanner.nextInt();

	        if (isPalindrome(num)) {
	            System.out.println(num + " is a palindrome");
	        } else {
	            System.out.println(num + " is not a palindrome");
	        }
	    }
	    /*In this program, the isPalindrome() 
	     * method takes an integer as input and converts it to a string using String.valueOf(). 
	     * It then creates a StringBuilder object and uses its reverse() method to reverse the string. 
	     * The reversed string is then compared with the original string using the equals() method.
	     *  If the two strings are equal, the number is considered a palindrome.
	     *  The main() method prompts the user to enter a number using the Scanner class, 
	     *  calls the isPalindrome() method to check if the number is a palindrome, 
	     *  and prints the appropriate message based on the result.
	*/
}


