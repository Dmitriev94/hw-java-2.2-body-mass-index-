public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 72;
        double height = 1.82;
        double bmi = service.calculate(weight, height);
        System.out.printf("Body mass index is %.2f",bmi);
    }
}
