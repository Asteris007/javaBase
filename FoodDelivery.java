import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int vegeMenu = Integer.parseInt(scanner.nextLine());

        double sumChick = chickenMenu * 10.35;
        double sumFish=fishMenu * 12.40;
        double sumVege =vegeMenu * 8.15;
        double sumMenues = sumChick+ sumFish + sumVege;


        double sumDesert = sumMenues * 0.20;
        double all = sumMenues + sumDesert + 2.50;
        System.out.println(all);

    }
}