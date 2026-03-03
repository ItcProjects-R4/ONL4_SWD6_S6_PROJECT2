public class grading {
public static String grade(double average) {
    if (average >= 90 && average <= 100) {
            return "A";
        } else if (average >= 80 && average < 90) {
            return "B";
        } else if (average >= 70 && average < 80) {
            return "C";
        } else if (average >= 0 && average < 70) {
            return "F";
        } else {
            return "Invalid average"; // Only triggers if < 0 or > 100
        }
}
}