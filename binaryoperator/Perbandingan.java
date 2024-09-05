package binaryoperator;

public class Perbandingan {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        boolean hasilSamaDengan = (a == b);
        System.out.println("a==b" + hasilSamaDengan);

        boolean hasilTidakSamaDengan = (a != b);
        System.out.println("a != 0" + hasilTidakSamaDengan);

        boolean hasilLebihKecil = (a < b);
        System.out.println("a < b" + hasilLebihKecil);

        boolean hasillebihBesar = (a > b);
        System.out.println("a > b : " + hasillebihBesar);


        boolean hasillebihBesarsamadengan = (a > b);
        System.out.println("a >= b : " + hasillebihBesarsamadengan);

        boolean hasilKecilSamaDengan = (a <= b);
        System.out.println("a <=b :" +hasilKecilSamaDengan );
    }
}
