import java.util.Scanner;

public class NivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start of range: ");
        int start = sc.nextInt();
        System.out.print("Enter end of range: ");
        int end = sc.nextInt();

        boolean found = false;
        System.out.println("Niven (Harshad) numbers between " + start + " and " + end + ":");
        for (int num = start; num <= end; num++) {
            int sum = 0, temp = num;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }

            if (sum != 0 && num % sum == 0) {
                System.out.println(num);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Niven numbers found in the given range.");
        }
    }
}
