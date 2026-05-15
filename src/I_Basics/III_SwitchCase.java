package I_Basics;

// https://www.geeksforgeeks.org/problems/java-switch-case-statement3529/1

import java.util.List;

public class III_SwitchCase {
    static double switchCase(int choice, List<Double> arr) {
        // code here
        return switch(choice) {
            case 1 -> Math.PI * arr.get(0) * arr.get(0);
            case 2 -> arr.get(0) * arr.get(1);
            default -> -1;
        };
    }
}
