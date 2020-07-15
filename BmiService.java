public class BmiService {
    public double calculate (double kg, double sm) {

        double bmi = (kg / ( sm * sm )) * 10_000;

        return bmi;
    }
}
