import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int nylonQuantity  = Integer.parseInt(scanner.nextLine());
        int paintQuantity = Integer.parseInt(scanner.nextLine());
        int  raztQuantity = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double sumNyl = (nylonQuantity +2) * 1.50;
        double sumPaint = (paintQuantity * 1.10)*14.50;
        double sumRazt = raztQuantity* 5.00;
        double sumMaterials = sumNyl + sumPaint + sumRazt + 0.40;
        double sumWorkers = (sumMaterials * 0.30) *hours;
        double endSum = sumMaterials + sumWorkers;

        System.out.println(endSum);
    }
}
