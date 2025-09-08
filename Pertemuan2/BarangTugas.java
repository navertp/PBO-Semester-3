package Pertemuan2;

public class BarangTugas {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;

    public int hitungHargaJual() {
        int hargaJual = hargaDasar - (int)(diskon/100*hargaDasar);
        return hargaJual;
    }

    public void tampilData() {
        System.out.println("Kode Barang     : " + kode);
        System.out.println("Nama Barang     : " + namaBarang);
        System.out.println("Harga Dasar     : Rp. " + hargaDasar);
        System.out.println("Diskon          : " + diskon + " %");
        System.out.println("Harga Jual      : Rp " + hitungHargaJual());
        System.out.println();
    }
}
