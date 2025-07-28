public class PenDistribution {
    public static void main(String[] args) {
        // Step 1: Declare total pens and number of students
        int totalPens = 14;
        int numberOfStudents = 3;

        // Step 2: Use division operator to find pens per student
        int pensPerStudent = totalPens / numberOfStudents;

        // Step 3: Use modulus operator to find remaining pens
        int remainingPens = totalPens % numberOfStudents;

        // Step 4: Print the result using a single print statement
        System.out.println(
            "The Pen Per Student is " + pensPerStudent + 
            " and the remaining pen not distributed is " + remainingPens
        );
    }
}
