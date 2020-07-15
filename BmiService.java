public class BmiService {
    public double calculate (double kg) {

        double sm = 151;

        double bmi = (kg / ( sm * sm )) * 10_000;

        return bmi;
    }
}
