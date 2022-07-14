package farm;



public class EvenNumbers {
    public static void main(String[] args) {

        int number = 300;

        for(int n=1;n<=number; n++){

            if(n % 2 == 0){
                System.out.print(n +" ");
            }
        }
    }
}