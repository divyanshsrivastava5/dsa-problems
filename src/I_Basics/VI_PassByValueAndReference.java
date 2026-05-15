package I_Basics;

// https://www.geeksforgeeks.org/problems/pass-by-reference-and-value/1

public class VI_PassByValueAndReference {
    static int[] passedBy(int a, int b) {
        // code here
        return new int[] {a + 1, b + 2};
    }
}
