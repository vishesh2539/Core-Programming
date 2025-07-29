/* Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM
I/P => NONE
O/P => Sam’s average mark in PCM is ___ 
 */
public class SamAverage {
    public static void main(String[] args){
        int maths = 94;
        int physics = 95;
        int chemistry = 96;

        int totalSubjects = 3;
        double average = (maths + physics + chemistry) / (double) totalSubjects;

        System.out.println("Sam's average marks in PCM is " + average);
    }
}
