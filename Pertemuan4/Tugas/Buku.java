package Pertemuan4.Tugas;

public class Buku {
    private String kodeBuku;
    private String judul;
    private String pengarang;

    public Buku(String kodeBuku, String judul, String pengarang) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.pengarang = pengarang;
    }

    public String info() {
        return "Kode: " + kodeBuku + "\nJudul: " + judul + "\nPengarang: " + pengarang + "\n";
    }
}