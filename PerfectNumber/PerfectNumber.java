import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start of range: ");
        int start = sc.nextInt();
        System.out.print("Enter end of range: ");
        int end = sc.nextInt();

        boolean found = false;
        System.out.println("Perfect numbers between " + start + " and " + end + ":");
        for (int num = start; num <= end; num++) {
            int sum = 0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0)
                    sum += i;
            }
            if (sum == num) {
                System.out.println(num);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Perfect numbers found in the given range.");
        }
    }
}
