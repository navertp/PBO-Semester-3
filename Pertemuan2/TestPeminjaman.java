package Pertemuan2;

public class TestPeminjaman {
    public static void main(String[] args) {
        Peminjaman p1 = new Peminjaman();
        p1.id = "P001";
        p1.namaMember = "Evan";
        p1.namaGame = "CYBERPUNK 2077";
        p1.lamaSewa = 3;
        p1.harga = 15000;
        p1.tampilData();

        Peminjaman p2 = new Peminjaman();
        p2.id = "P002";
        p2.namaMember = "Dina";
        p2.namaGame = "THE SIMS 4";
        p2.lamaSewa = 5;
        p2.harga = 20000;
        p2.tampilData();
    }
}
