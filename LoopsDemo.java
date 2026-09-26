public class LoopsDemo {
    public static void main(String[] args) {

        // 1. FOR LOOP
        // Used when you know exact number of iterations in advance
        System.out.println("--- 1. For Loop ---");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }

        // 2. WHILE LOOP
        // Checks condition FIRST, then executes as long as condition is true
        System.out.println("\n--- 2. While Loop ---");
        int j = 1;
        while (j <= 5) {
            System.out.println("Count: " + j);
            j++; // Increment counter so loop doesn't run forever
        }

        // 3. DO-WHILE LOOP
        // Executes block FIRST at least once, then checks condition
        System.out.println("\n--- 3. Do-While Loop ---");
        int k = 1;
        do {
            System.out.println("Count: " + k);
            k++; // Increment counter
        } while (k <= 5);

        // 4. ENHANCED FOR LOOP (FOR-EACH LOOP)
        // Used to iterate through items in an array without using indexes
        System.out.println("\n--- 4. Enhanced For Loop ---");
        int[] scores = {10, 20, 30, 40, 50};
        for (int score : scores) {
            System.out.println("Score: " + score);
        }
    }
}