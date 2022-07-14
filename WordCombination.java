package farm;

public class WordCombination {
    public static void main(String[] args) {

        for (int n1 = 0; n1 <=9 ; n1++) {
            for (int n2 = 0; n2 <= 9; n2++) {
                for (char ch1 = 'a'; ch1 <= 'z'; ch1++) {
                    for(char ch2= 'a';ch2 <='z'; ch2++){
                        for (int n3 = 0; n3 <=9; n3++) {
                            System.out.print(String.format("%d%d%c%c%d ", n1,n2,ch1,ch2,n3));

                        }
                    }
                }

            }
            
        }



    }
}
