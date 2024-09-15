package Tugas;
import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kata dalam bentuk camelCase:");
        String word = input.nextLine();

        int JumlahKata = 1;

        for (int i= 0; i<word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))){
                JumlahKata++;
            }
        }
        System.out.println("jumlah kata dalam camelCase: "+ JumlahKata);
        input.close();

    }
}
