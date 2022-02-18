import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int hight = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double volume = length * width * hight;
        double volumeLitres = volume * 0.001;
        double busySpace = percent / 100;
        double needLitre = volumeLitres * (1-busySpace);
        System.out.println(needLitre);
    }
}
