package I_Basics;

// https://leetcode.com/problems/reverse-integer/

public class ReverseInteger {
    public int reverse(int x) {
        int rev = 0;
        boolean isNeg = x < 0;
        x = Math.abs(x);

        while (x > 0) {
            int digit = x % 10;

            System.out.println(rev);
            System.out.println((Integer.MIN_VALUE - digit) / 10);
            System.out.println((Integer.MAX_VALUE - digit) / 10);

            if (rev < -(Integer.MIN_VALUE - digit) / 10 || rev > (Integer.MAX_VALUE - digit) / 10) {
                return 0;
            }

            rev = 10 * rev + digit;
            x /= 10;
        }

        return isNeg ? -rev : rev;
    }
}
