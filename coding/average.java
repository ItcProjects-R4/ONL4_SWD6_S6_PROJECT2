
public class Average {

    public static double calculate(double[] grade) {

        double sum = 0;

        for (int i = 0; i < 5; i++) {
            sum += grade[i];
        }

        return sum / 5;
    }

}