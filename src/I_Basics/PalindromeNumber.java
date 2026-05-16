package I_Basics;

// https://leetcode.com/problems/palindrome-number/

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int num = x;
        int rev = 0;
        while (num > 0) {
            int digit = num % 10;
            rev = 10 * rev + digit;
            num /= 10;
        }

        return x == rev;
    }
}
