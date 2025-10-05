package Pertemuan6.Praktikum.HewanOOP3;

class Hewan {
    String nama;
    int umur;
    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
        System.out.println("Konstruktor Hewan dipanggil");
    }

    public void berjalan() {
        System.out.println(nama + " sedang berjalan");
    }
}
