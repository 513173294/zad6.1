import java.util.Arrays;
import java.util.Random;

public class Palindromy {
    public static void main(String[] args) {
        int[] tablica = new int[10];
        Random random = new Random();

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = random.nextInt(10);

        }

        String tab = Arrays.toString(tablica);
        System.out.println(tab + " ");

        int x = tablica.length - 1;

        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + ", ");
            while (i == tablica.length - 1) {
                System.out.print(tablica[x] + ", ");
                x--;
                if (x < 0) break;
            }

        }
    }
}
