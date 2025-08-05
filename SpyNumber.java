import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start of range: ");
        int start = sc.nextInt();
        System.out.print("Enter end of range: ");
        int end = sc.nextInt();

        boolean found = false;
        System.out.println("Spy numbers between " + start + " and " + end + ":");
        for (int num = start; num <= end; num++) {
            int sum = 0, product = 1, temp = num;
            while (temp > 0) {
                int digit = temp % 10;
                sum += digit;
                product *= digit;
                temp /= 10;
            }

            if (sum == product) {
                System.out.println(num);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Spy numbers found in the given range.");
        }
    }
}
