package main.java.Algorithms.General;

/**
 * Created by hungle on 1/23/18.
 */
public class RoundingScores {
    public static void main(String[] args) {
        int[] grades = {73, 67, 38, 33};
        solve(grades);
        return;
    }

    private static int[] solve(int[] grades){
        int[] newGrades = new int[grades.length];
        // Complete this function
        for (int index = 0; index < grades.length; index++) {
            int grade = grades[index];
            int multitudeOf5 = (grade / 5) + 1;
            int newGrade = multitudeOf5 * 5;
            if (newGrade - grade < 3 && newGrade >= 40) {
                newGrades[index] = newGrade;
            } else {
                newGrades[index] = grade;
            }
        }
        return newGrades;
    }
}
