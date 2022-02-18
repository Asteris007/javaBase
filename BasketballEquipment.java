import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearTax = Integer.parseInt(scanner.nextLine());

        double converse = yearTax -(yearTax* 0.40);
        double equipment = converse - (converse * 0.20);
        double ball = equipment / 4;
        double acsess = ball / 5;
        double sum = yearTax+ converse + equipment + ball + acsess;
        System.out.println(sum
        );
    }
}
