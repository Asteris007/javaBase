public class percentDivisionToSimpleNumbers {

    public static void main(String[] args) {
        boolean simple;
        int numSimple = 1;
       double precent;

        for (int i = 1; i <= 300; i++) {

            simple=true;

            for (int j = 2; j <= i/2; j++) {

                if(i%j==0){
                    simple=false;
                    break;
                }
            }
            if(simple) {
                System.out.println(i);

                numSimple++;
            }

        }

        precent = numSimple * 100/ 300;
        System.out.println("The result in % is: " + precent);

    }
}
