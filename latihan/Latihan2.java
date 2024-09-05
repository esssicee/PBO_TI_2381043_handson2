package latihan;

import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        int awan [] = new int[3];
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan nilai pertama awan : ");
        awan[0] = input.nextInt();

        System.out.print("Masukan nilai kedua awan : ");
        awan[1] = input.nextInt();

        System.out.print("Masukan nilai ketiga awan : ");
        awan[1] = input.nextInt();


        int Terbesar = awan[0];

        for (int i=1; i< 3; i++){
            if (Terbesar < awan[i]){
                Terbesar = awan[i];
            }
        }
        System.out.println(Terbesar);

    }
}
