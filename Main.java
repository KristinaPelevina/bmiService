public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();

        double bmi = bmiService.calculate(47);

        System.out.println(bmi);

//        double kg = 47;
//        double sm = 151;
//
//        double bmi = (kg / ( sm * sm )) * 10_000;
//
//        System.out.println(bmi);
    }
}
