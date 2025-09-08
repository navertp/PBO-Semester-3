package Pertemuan2;

public class TestBarangTugas {
    public static void main(String[] args) {
        BarangTugas b1 = new BarangTugas();
        b1.kode = "B001";
        b1.namaBarang = "Ram Kingston Fury 16GB";
        b1.hargaDasar = 500000;
        b1.diskon = 10;
        b1.tampilData();

        BarangTugas b2 = new BarangTugas();
        b2.kode = "B002";
        b2.namaBarang = "Redmi Buds 3 Pro";
        b2.hargaDasar = 200000;
        b2.diskon = 5;
        b2.tampilData();
    }
}
