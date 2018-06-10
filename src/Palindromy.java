import java.util.Arrays;
import java.util.Random;

public class Palindromy {
    public static void main(String[] args) {
        int[] tablica = new int[10];
        Random random = new Random();

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = random.nextInt(10);

        }

//        for (int aTablica : tablica){
//            System.out.print(aTablica + ", ");
//        }

        String tab = Arrays.toString(tablica);
        System.out.print(tab+ " ");

        for (int i = tablica.length - 1; i < tablica.length; i--) {
            System.out.print(tablica[i] + ", ");
            if (i == 0) break;
        }
    }
}
