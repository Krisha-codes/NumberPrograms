import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start of range: ");
        int start = sc.nextInt();
        System.out.print("Enter end of range: ");
        int end = sc.nextInt();

        boolean found = false;
        System.out.println("Strong numbers between " + start + " and " + end + ":");
        for (int num = start; num <= end; num++) {
            int sum = 0, temp = num;
            while (temp > 0) {
                int digit = temp % 10;
                sum += factorial(digit);
                temp /= 10;
            }
            if (sum == num) {
                System.out.println(num);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Strong numbers found in the given range.");
        }
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact *= i;
        return fact;
    }
}
