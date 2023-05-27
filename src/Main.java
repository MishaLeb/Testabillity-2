// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bmi = service.calculate(2.01, 103);
        System.out.println("Body mass index: " + bmi);
    }
}