package unaryoperator;

public class UnaryOperator {
    public static void main(String[] args) {
        int x = 10;
        boolean benar = true;

        System.out.println(-x);
        System.out.println(+x);

        //pre - increment
        System.out.println("PRE - INCREMENT : TAMBAH DULU BARU DI CETAK");
        System.out.println("x awal : " + x);
        System.out.println("++x : " + ++x);
        System.out.println("setelah x : " + x);

        //Post - Increment
        System.out.println("post - INCREMENT : TAMBAH DULU BARU DI CETAK ");
        System.out.println("x awal : " + x);
        System.out.println("x++ : " + x++);
        System.out.println("setelah x :" + x);

        //Boolean
        System.out.println("value variable  !benar  : "+ benar);
    }
}
