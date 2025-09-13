package Pertemuan3;

import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Anggota dzul = new Anggota("666777888", "Dzul Kardun", 5000000);
        System.out.println("Nama Anggota: " + dzul.getNama());
        System.out.println("Limit Pinjaman: " + dzul.getLimitPinjaman());

        System.out.print("\nMasukkan jumlah pinjaman: ");
        int pinjam = sc.nextInt();
        dzul.pinjam(pinjam);
        System.out.println("Jumlah pinjaman saat ini: " + dzul.getJumlahPinjaman());

        System.out.print("\nMasukkan jumlah angsuran: ");
        int angsuran = sc.nextInt();
        dzul.angsur(angsuran);
        System.out.println("Jumlah pinjaman saat ini: " + dzul.getJumlahPinjaman());
    }
}