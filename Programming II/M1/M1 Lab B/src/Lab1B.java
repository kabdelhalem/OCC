import java.io.*;
import java.util.Scanner;

class Palindrome {

    public static boolean isPalindrome(String inputStr)

    {

        String reverseString = "";

        boolean answer = false;

        for (int i = inputStr.length() - 1; i >= 0; i--) {

            reverseString = reverseString + inputStr.charAt(i);

        }

        if (inputStr.equals(reverseString)) {

            answer = true;

        }

        return answer;

    }

    public static void main(String[] args)

    {

        // Prompt the user for a string. a. Your code goes here

        String myString;
        
        System.out.println("Enter a string: ");
        Scanner input = new Scanner(System.in);
        myString = input.nextLine();

        // Convert the input string to lowercase using toLowerCase() method.

        // b. Your code goes here

        myString = myString.toLowerCase();

        // Invoke isPalindrome

        // c. Your code goes here.

        if (Palindrome.isPalindrome(myString)) {

            System.out.println(myString + " is a palindrome.");

        } else {

            System.out.println(myString + " is not a palindrome.");

        }

        // display if the string is or is not a palindrome.

        // d. Your code goes here.

    }

}