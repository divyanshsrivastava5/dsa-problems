package I_Basics;

// https://www.geeksforgeeks.org/problems/prime-number2314/1?page=1&category=Java-Class%20and%20Object%2CJava-Control-Flow&sortBy=difficulty

public class IV_PrimeNumber {
    static boolean isPrime(int n) {
        // code here
        if (n == 1) return false;
        if (n == 2) return true;

        for (int i = 2 ; i * i <= n ; i++) {
            if(n % i == 0) return false;
        }

        return true;
    }
}
