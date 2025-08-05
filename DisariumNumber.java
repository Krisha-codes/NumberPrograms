import java.util.Scanner;

public class DisariumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start of range: ");
        int start = sc.nextInt();
        System.out.print("Enter end of range: ");
        int end = sc.nextInt();

        boolean found = false;
        System.out.println("Disarium numbers between " + start + " and " + end + ":");
        for (int num = start; num <= end; num++) {
            String str = String.valueOf(num);
            int sum = 0;
            for (int i = 0; i < str.length(); i++) {
                int digit = Character.getNumericValue(str.charAt(i));
                sum += Math.pow(digit, i + 1);
            }

            if (sum == num) {
                System.out.println(num);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Disarium numbers found in the given range.");
        }
    }
}
