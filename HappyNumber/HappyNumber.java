public class HappyNumber {
    public static void main(String[] args) {
        int num = 19;
        int result = num;
        
        while (result != 1 && result != 4) {
            result = getSumOfSquares(result);
        }

        if (result == 1)
            System.out.println(num + " is a Happy Number.");
        else
            System.out.println(num + " is not a Happy Number.");
    }

    public static int getSumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
