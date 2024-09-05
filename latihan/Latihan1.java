package latihan;

import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        int awan [] = new int[2];
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan nilai pertama awan : ");
        awan[0] = input.nextInt();

        System.out.print("Masukan nilai kedua awan : ");
        awan[1] = input.nextInt();

        if (awan[0] > awan[1]){
            System.out.println(awan[0]);

        }else{
            System.out.println(awan[1]);
        }

    }
}
