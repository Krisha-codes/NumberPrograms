import java.util.Scanner;

public class TechNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start of range: ");
        int start = sc.nextInt();
        System.out.print("Enter end of range: ");
        int end = sc.nextInt();

        boolean found = false;
        System.out.println("Tech numbers between " + start + " and " + end + ":");
        for (int num = start; num <= end; num++) {
            String str = String.valueOf(num);
            int len = str.length();

            if (len % 2 == 0) {
                int half = len / 2;
                int firstHalf = Integer.parseInt(str.substring(0, half));
                int secondHalf = Integer.parseInt(str.substring(half));

                int sum = firstHalf + secondHalf;
                if (sum * sum == num) {
                    System.out.println(num);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No Tech numbers found in the given range.");
        }
    }
}
