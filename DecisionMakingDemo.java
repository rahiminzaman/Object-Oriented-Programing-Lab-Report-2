public class DecisionMakingDemo {
    public static void main(String[] args) {
        int number = 10;

        // 1. SIMPLE IF STATEMENT
        // Checks if a single condition is true
        if (number > 0) {
            System.out.println("The number is positive.");
        }

        // 2. IF-ELSE STATEMENT
        // Chooses between two paths (even or odd)
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        // 3. IF-ELSE-IF LADDER
        // Checks multiple conditions in sequence
        if (number < 0) {
            System.out.println("The number is negative.");
        } else if (number == 0) {
            System.out.println("The number is zero.");
        } else {
            System.out.println("The number is positive.");
        }

        // 4. SWITCH STATEMENT
        // Selects a code block based on a single exact value
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Other day");
                break;
        }
    }
}

