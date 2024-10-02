package Task2;

import java.util.Scanner;

public class Task2_ArmstrongNum {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number to check if it's not an Armstrong number: ");
	        int number = scanner.nextInt();

	        if (!isArmstrong(number)) {
	            System.out.println(number + " is not an Armstrong number.");
	            System.out.println("Reversed Number: " + reverseNumber(number));
	        } else {
	            System.out.println(number + " is an Armstrong number.");
	        }
	    }

	    public static boolean isArmstrong(int number) {
	        int originalNumber = number;
	        int result = 0;
	        int n = String.valueOf(number).length();

	        while (originalNumber != 0) {
	            int remainder = originalNumber % 10;
	            result += Math.pow(remainder, n);
	            originalNumber /= 10;
	        }

	        return result == number;
	    }

	    public static int reverseNumber(int number) {
	        int reversed = 0;
	        
	        while (number != 0) {
	            int digit = number % 10;
	            reversed = reversed * 10 + digit;
	            number /= 10;
	        }
	        
	        return reversed;
	    }
}
