package Pertemuan2;

public class Peminjaman {
    public String id;
    public String namaMember;
    public String namaGame;
    public int lamaSewa;
    public double harga;

    public void tampilData() {
        System.out.println("ID Peminjaman   : " + id);
        System.out.println("Nama Member     : " + namaMember);
        System.out.println("Nama Game       : " + namaGame);
        System.out.println("Lama Sewa       : " + lamaSewa + " hari");
        System.out.println("Harga / Hari    : Rp " + harga);
        System.out.println("Total Bayar     : Rp " + hitungHargaBayar());
        System.out.println();
    }

    public double hitungHargaBayar() {
        double total = lamaSewa * harga;
        return total;
    }
}
