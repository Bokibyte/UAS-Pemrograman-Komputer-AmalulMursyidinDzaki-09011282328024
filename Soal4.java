import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soal4 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan bilangan bulat positif: ");
            int n = scanner.nextInt();

            List<Integer> faktor = new ArrayList<>();

            for (int i = 2; i <= n; i++) {
                while (n % i == 0) {
                    faktor.add(i);
                    n /= i;
                }
            }

            System.out.println("Faktorisasi " + n + ": ");
            for (int faktor1 : faktor) {
                System.out.print(faktor1 + " ");
            }
        }
    }
}

