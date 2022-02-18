import java.util.Scanner;

public class VocationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int book = Integer.parseInt(scanner.nextLine());
        int pages = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int timeToRead = book / pages;
        int hours = timeToRead / days;
        System.out.println(hours);
    }
}
