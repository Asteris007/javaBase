package farm;

public class Vacantion {
    public static void main(String[] args) {
        double vacantion = 10000;
        double overnight = vacantion / 2;
        double beachTh = vacantion * 0.05;
        double restaurant = vacantion * 0.30;
        double fun = vacantion * 0.10;
        double other = vacantion * 0.05;
        double expenses = vacantion * 0.9;

        System.out.printf("The vacantion value is: %.0f lv. %n", vacantion);
        System.out.printf("The overnight is: %.0f lv. %n", overnight);
        System.out.printf(" The Beach things are: %.0f lv.%n", beachTh);
        System.out.printf(" The restaurant is: %.0f lv. %n", restaurant);
        System.out.printf(" The additional entertaiments are: %.0f lv. %n", fun);
        System.out.printf(" The other stuff are: %.0f lv. %n", other);

        System.out.printf(" The all expenses are: %.0f lv. %n", expenses);
    }
}
