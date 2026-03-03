import java.util.Scanner;
import java.util.InputMismatchException;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] n = new double[5];
        System.out.println("Please Enter The 5 Grades, one at a time:");
        for (int i = 0; i < 5; i++) {
            boolean resume = true;
            while (resume) {
                System.out.print("Grade " + (i + 1) + ": ");
                try {
                    double input = scanner.nextDouble();
                    if (input < 0 || input > 100) {
                        throw new InputMismatchException("Grade must be between 0 and 100.");
                    }
                    n[i] = input;
                    resume = false;
                } catch (InputMismatchException err) {
                    System.out.println("Invalid input. Please enter a valid number between 0 and 100.");
                    if (err.getMessage() == null) {
                        scanner.next();
                    }
                }
            }
        }
        scanner.close();
        double avg = Average.calculate(n);
        System.out.println("The Grades Are: ");
        for (double num : n) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("The average of the grades is : " + avg + "/100");
    }
}
