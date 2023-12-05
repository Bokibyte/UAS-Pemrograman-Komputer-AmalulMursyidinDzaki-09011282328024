import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kata atau frase: ");
        String input = scanner.nextLine();

        String cleanedInput = input.replaceAll("\\s", "").toLowerCase();

        if (isPalindrom(cleanedInput)) {
            System.out.println("\"" + input + "\" adalah palindrom.");
        } else {
            System.out.println("\"" + input + "\" bukan palindrom.");
        }

        scanner.close();
    }

    public static boolean isPalindrom(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}