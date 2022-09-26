package percabangan;

import java.util.Scanner;

public class Matematika {

    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        
        System.out.println("Menu Aplikasi Matematika : \n1. Penambahan 2. Pengurangan 3. Perkalian 4.Pembagian");
        System.out.print("Pilih Menu: ");
        int pilihan = inputUser.nextInt();

        if (pilihan == 1) {
            System.out.print("masukan angka pertama : ");
            int penambahan = inputUser.nextInt();
            System.out.print("masukan angka kedua : ");
            int penambahan2 = inputUser.nextInt();
            int tambah = penambahan + penambahan2; 
            System.out.println("\tHasil penambahan antara " + penambahan + " dan " + penambahan2 + " adalah " + tambah);

        } else if (pilihan == 2) {
            System.out.print("masukan angka pertama : ");
            int pengurangan = inputUser.nextInt();
            System.out.print("masukan angka kedua : ");
            int pengurangan2 = inputUser.nextInt();
            int kurang = pengurangan - pengurangan2;
            System.out.println("\tHasil pengurangan antara " + pengurangan + " dan " + pengurangan2 + " adalah " + kurang);

        } else if (pilihan == 3) {
            System.out.print("masukan angka pertama : ");
            int perkalian = inputUser.nextInt();
            System.out.print("masukan angka kedua : ");
            int perkalian2 = inputUser.nextInt();
            int kali = perkalian * perkalian2;
            System.out.println("\tHasil perkalian antara " + perkalian + " dan " + perkalian2 + " adalah " + kali);

        } else if (pilihan == 4) {
            System.out.print("masukan angka pertama : ");
            double pembagian = inputUser.nextDouble();
            System.out.print("masukan angka kedua : ");
            double pembagian2 = inputUser.nextDouble();
            double bagi = pembagian / pembagian2;
            System.out.println("\tHasil pembagian antara " + pembagian + " dan " + pembagian2 + " adalah " + bagi);

        } else {
            System.err.println("Syntax ERROR");
        }
    }
}
