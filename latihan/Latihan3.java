package latihan;

import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        int hasil =0;
        int[] nama = new int[2];
        int typeOperand = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukan nilai ke satu : ");
        nama[0] =input.nextInt();

        System.out.print("Masukan nilai ke dua : ");
        nama[1] =input.nextInt();

        System.out.print("Masukan type operand : ");
        typeOperand =input.nextInt();

        switch (typeOperand){
            case 1:
                hasil = nama[0] + nama[1];
                break;

            case 2:
                hasil = nama[0] - nama[1];
                break;
            case 3:
                hasil = nama[0] * nama[1];
                break;

            case 4:
                hasil = nama[0] / nama[1];
                break;
            case 5:
                hasil = nama[0] % nama[1];
                break;

            default:
                System.out.println("sorry pilihan anda tidak ada");
                System.exit(0);



        }
        System.out.println(hasil);
    }
}
