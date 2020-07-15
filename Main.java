public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();

        double bmi = bmiService.calculate(47, 151);

        System.out.println(bmi);

   }
}
