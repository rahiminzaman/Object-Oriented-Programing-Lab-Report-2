public class VariablesDemo {

    // 1. INSTANCE VARIABLE
    // Lives inside the class, belongs to each object/instance separately
    int studentAge = 20;

    // 2. STATIC VARIABLE
    // Shared across ALL objects (only one copy exists in memory)
    static String schoolName = "Tech University";

    // Method to demonstrate variables
    public void displayDetails() {

        // 3. LOCAL VARIABLE
        // Declared inside a method; destroyed when method finishes
        int score = 95;

        // 4. FINAL VARIABLE
        // Constant value; cannot be modified once set
        final double MIN_PASSING_GRADE = 3.0;

        System.out.println("--- Student Record ---");
        System.out.println("Student Age (Instance): " + studentAge);
        System.out.println("School (Static): " + schoolName);
        System.out.println("Exam Score (Local): " + score);
        System.out.println("Passing Grade (Final): " + MIN_PASSING_GRADE);
    }

    public static void main(String[] args) {

        // Creating an object to access instance variables and methods
        VariablesDemo student1 = new VariablesDemo();
        student1.displayDetails();

        System.out.println("\n--- Static Access ---");
        // Static variables can be accessed directly using the class name
        System.out.println("School Name via Class: " + VariablesDemo.schoolName);
    }
}