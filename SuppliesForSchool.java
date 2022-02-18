import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int penN = Integer.parseInt(scanner.nextLine());
        int markN = Integer.parseInt(scanner.nextLine());
        int litreN = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        double penPr = penN * 5.80;
        double markPr = markN * 7.20;
        double litrPr = litreN * 1.20;
        double percF = percent / 100;
        double sume = penPr + markPr + litrPr;
        double sumDiscount = sume - (sume* (percent /100.0)) ;
        System.out.println(sumDiscount);

    }
}
