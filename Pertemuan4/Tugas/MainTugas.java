package Pertemuan4.Tugas;

public class MainTugas {
    public static void main(String[] args) {
        Anggota a = new Anggota("A01", "Tarmiji", "Jl. Suhat Hatta No. 45");
        Buku b = new Buku("B1001", "Pemrograman Java", "Sutristno");
        Petugas p = new Petugas("P01", "Anyujin");
        Peminjaman pem = new Peminjaman(a, b, p, "20-09-2025", "27-09-2025");

        System.out.println(pem.info());
    }
}