package Tugas;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int l = scanner.nextInt();

        int[] arr = new int[l];

        System.out.println("Masukkan " + l  + " elemen nya:");
        for (int i = 0; i < l; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        int hasil = 0;
        for (int i = 0; i < l; i++) {
            hasil += arr[i];
        }

        System.out.println("Jumlah elemen array adalah: " + hasil);

        scanner.close();

    }
}
