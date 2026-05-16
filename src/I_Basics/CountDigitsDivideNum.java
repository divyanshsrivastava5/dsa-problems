package I_Basics;

// https://www.geeksforgeeks.org/problems/count-digits5716/1

public class CountDigitsDivideNum {
    static int evenlyDivides(int n) {
        // code here
        int count = 0;
        int num = n;

        while (n > 0) {
            int digit = n % 10;
            if (digit != 0 && num % digit == 0) {
                ++count;
            }

            n /= 10;
        }

        return count;
    }
}
