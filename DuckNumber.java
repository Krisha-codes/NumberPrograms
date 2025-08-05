import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start of range: ");
        int start = sc.nextInt();
        System.out.print("Enter end of range: ");
        int end = sc.nextInt();

        boolean found = false;
        System.out.println("Duck numbers between " + start + " and " + end + ":");
        for (int num = start; num <= end; num++) {
            String str = String.valueOf(num);
            if (str.charAt(0) != '0' && str.contains("0")) {
                System.out.println(num);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Duck numbers found in the given range.");
        }
    }
}
