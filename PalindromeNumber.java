import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start of range: ");
        int start = sc.nextInt();
        System.out.print("Enter end of range: ");
        int end = sc.nextInt();

        boolean found = false;
        System.out.println("Palindrome numbers between " + start + " and " + end + ":");
        for (int num = start; num <= end; num++) {
            int original = num, reversed = 0;
            int temp = num;
            while (temp != 0) {
                int digit = temp % 10;
                reversed = reversed * 10 + digit;
                temp /= 10;
            }

            if (original == reversed) {
                System.out.println(num);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Palindrome numbers found in the given range.");
        }
    }
}
