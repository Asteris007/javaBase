public class SimpleNumbers1to300 {
    public static void main(String[] args) {

        boolean simple;

        for (int i = 1; i <=300;i++ ) {
            simple=true;
            for (int j = 2; j <=i/2; j++) {


                if (i % j == 0) {
                    simple = false;
                    break;
                }

            }
            if(simple) {
                System.out.println(i);
            }
        }


    }
}
