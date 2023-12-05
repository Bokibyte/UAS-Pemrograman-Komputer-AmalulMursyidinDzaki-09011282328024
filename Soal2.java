import java.util.Scanner;

public class Soal2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String username = "jekiSadboyAmbyar";
        String password = "kakSepti6969awwwwww";
        System.out.print("Masukan Username:");
        String inUser = sc.nextLine();
        System.out.print("Masukan Password:");
        String inPassword = sc.nextLine();
        if(inUser.equals(username)){
            if(inPassword.equals(password)){
            System.out.print("Autentikasi Berhasil!");
            }else{
            System.out.print("Autentikasi Gagal!");
            }
        }else{
            System.out.print("Autentikasi Gagal!");
        }
    }
}
