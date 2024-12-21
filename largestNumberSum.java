import java.util.Scanner;
public class largestNumberSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.println("Enter the third number: ");
        int num3 = sc.nextInt();

        // Find the largest number
        int largest = Math.max(num1, Math.max(num2, num3));

        // Display the largest number and its sum
        System.out.println("Largest number is: " + largest);
        System.out.println("Sum of all numbers is: " + (num1 + num2 + num3));
    }
}
