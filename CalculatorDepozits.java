import java.util.Scanner;

public class CalculatorDepozits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double deposit = Double.parseDouble(scanner.nextLine());
        int mounts = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double interest = deposit * (percent / 100);
        double interestRes = interest / 12;
        double result  = deposit + mounts * interestRes;

        System.out.println(result);

    }
}
