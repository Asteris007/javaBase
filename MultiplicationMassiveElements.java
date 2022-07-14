package farm;



public class MultiplicationMassiveElements {
    public static void main(String[] args) {

        double[]casets = {5,6,7,9};
       double[]prices={2.5,3.6,8.9,7.5};
       double res, sum;
        String result ="";


        for(int i=0;i<=casets.length;i++) {
           double pr = prices[i];
           double ca = casets[i];
           res= ca*pr;

           System.out.println(res);

        //result = Double.toString(ca * pr) + " ";
          // System.out.println("result is:" + result);
       }












    }
}