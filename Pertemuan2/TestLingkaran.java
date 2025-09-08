package Pertemuan2;

public class TestLingkaran {
    public static void main(String[] args) {
        Lingkaran ling = new Lingkaran();
        ling.phi = 3.14;
        ling.r = 9;

        System.out.println("Jari-jari       : " + ling.r);
        System.out.println("Luas Lingkaran  : " + ling.hitungLuas());
        System.out.println("Keliling        : " + ling.hitungKeliling());
    }
}
