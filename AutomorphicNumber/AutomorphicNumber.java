import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start of range: ");
        int start = sc.nextInt();
        System.out.print("Enter end of range: ");
        int end = sc.nextInt();

        boolean found = false;
        System.out.println("Automorphic numbers between " + start + " and " + end + ":");
        for (int num = start; num <= end; num++) {
            int square = num * num;
            if (String.valueOf(square).endsWith(String.valueOf(num))) {
                System.out.println(num);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Automorphic numbers found in the given range.");
        }
    }
}
