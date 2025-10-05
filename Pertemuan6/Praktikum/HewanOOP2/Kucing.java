package Pertemuan6.Praktikum.HewanOOP2;

class Kucing extends Hewan {
    String ras;

    public Kucing(String nama, int umur, String ras) {
        super(nama, umur);
        this.ras = ras;
        System.out.println("Konstruktor Kucing dipanggil.");
        System.out.println("Nama: " + nama + ", Umur: " + umur + ", Ras: " + ras);
    }
}
