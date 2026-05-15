package I_Basics;

import java.util.Scanner;

public class II_IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // code here
        if (n < m) System.out.println("less");
        else if (n > m) System.out.println("greater");
        else System.out.println("equal");
    }
}
