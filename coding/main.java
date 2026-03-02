import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] n = new int[5];
        System.out.println("Please Enter The 5 Grades, one at a time:");
        for (int i = 0; i < 5; i++) {
            boolean resume = true;
            while (resume) {
                System.out.print("Grade " + (i + 1) + ": ");
                try {
                    int input = scanner.nextInt();
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
        //int avg = Average Function (n)
        //Grade Function (avg)
        System.out.println("The Grades Are: ");
        for (int num : n) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
