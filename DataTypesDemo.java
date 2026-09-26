public class DataTypesDemo {
    public static void main(String[] args) {

        // ==========================================
        // 1. PRIMITIVE DATA TYPES (Basic values)
        // ==========================================

        // Integer numbers
        byte age = 20;               // 1 byte  (-128 to 127)
        short distance = 1500;       // 2 bytes (-32,768 to 32,767)
        int salary = 50000;          // 4 bytes (Standard number type)
        long population = 8000000000L; // 8 bytes (Large numbers, needs 'L' at the end)

        // Decimal numbers
        float height = 5.9f;         // 4 bytes (Needs 'f' at the end)
        double gpa = 3.85;           // 8 bytes (Standard decimal type)

        // Single character & True/False
        char grade = 'A';            // 2 bytes (Stores a single character in single quotes)
        boolean isPassed = true;     // 1 bit   (Stores true or false)

        // ==========================================
        // 2. NON-PRIMITIVE DATA TYPES (Objects/Arrays)
        // ==========================================

        String studentName = "Alex";           // Text sequence in double quotes
        int[] testScores = {90, 85, 88};       // Array storing multiple values

        // ==========================================
        // 3. DISPLAYING OUTPUTS
        // ==========================================

        System.out.println("--- Student Details ---");
        System.out.println("Name: " + studentName);
        System.out.println("Age: " + age + " years");
        System.out.println("Height: " + height + " ft");
        System.out.println("GPA: " + gpa);
        System.out.println("Grade: " + grade);
        System.out.println("Passed Course: " + isPassed);

        System.out.println("\n--- Additional Info ---");
        System.out.println("Monthly Salary: $" + salary);
        System.out.println("City Population: " + population);

        // Printing array elements using a simple loop
        System.out.print("Test Scores: ");
        for (int score : testScores) {
            System.out.print(score + " ");
        }
        System.out.println(); // Prints a new line at the end
    }
}